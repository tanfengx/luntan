package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YouxiutieziEntity;
import com.entity.view.YouxiutieziView;

import com.service.YouxiutieziService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 优秀帖子
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
@RestController
@RequestMapping("/youxiutiezi")
public class YouxiutieziController {
    @Autowired
    private YouxiutieziService youxiutieziService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouxiutieziEntity youxiutiezi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huiyuan")) {
			youxiutiezi.setHuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YouxiutieziEntity> ew = new EntityWrapper<YouxiutieziEntity>();

		PageUtils page = youxiutieziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiutiezi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouxiutieziEntity youxiutiezi, 
		HttpServletRequest request){
        EntityWrapper<YouxiutieziEntity> ew = new EntityWrapper<YouxiutieziEntity>();

		PageUtils page = youxiutieziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiutiezi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouxiutieziEntity youxiutiezi){
       	EntityWrapper<YouxiutieziEntity> ew = new EntityWrapper<YouxiutieziEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youxiutiezi, "youxiutiezi")); 
        return R.ok().put("data", youxiutieziService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouxiutieziEntity youxiutiezi){
        EntityWrapper< YouxiutieziEntity> ew = new EntityWrapper< YouxiutieziEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youxiutiezi, "youxiutiezi")); 
		YouxiutieziView youxiutieziView =  youxiutieziService.selectView(ew);
		return R.ok("查询优秀帖子成功").put("data", youxiutieziView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouxiutieziEntity youxiutiezi = youxiutieziService.selectById(id);
		youxiutiezi.setClicknum(youxiutiezi.getClicknum()+1);
		youxiutiezi.setClicktime(new Date());
		youxiutieziService.updateById(youxiutiezi);
        youxiutiezi = youxiutieziService.selectView(new EntityWrapper<YouxiutieziEntity>().eq("id", id));
        return R.ok().put("data", youxiutiezi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouxiutieziEntity youxiutiezi = youxiutieziService.selectById(id);
		youxiutiezi.setClicknum(youxiutiezi.getClicknum()+1);
		youxiutiezi.setClicktime(new Date());
		youxiutieziService.updateById(youxiutiezi);
        youxiutiezi = youxiutieziService.selectView(new EntityWrapper<YouxiutieziEntity>().eq("id", id));
        return R.ok().put("data", youxiutiezi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouxiutieziEntity youxiutiezi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxiutiezi);
        youxiutieziService.insert(youxiutiezi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouxiutieziEntity youxiutiezi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(youxiutiezi);
        youxiutieziService.insert(youxiutiezi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YouxiutieziEntity youxiutiezi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youxiutiezi);
        youxiutieziService.updateById(youxiutiezi);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<YouxiutieziEntity> list = new ArrayList<YouxiutieziEntity>();
        for(Long id : ids) {
            YouxiutieziEntity youxiutiezi = youxiutieziService.selectById(id);
            youxiutiezi.setSfsh(sfsh);
            youxiutiezi.setShhf(shhf);
            list.add(youxiutiezi);
        }
        youxiutieziService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youxiutieziService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,YouxiutieziEntity youxiutiezi, HttpServletRequest request,String pre){
        EntityWrapper<YouxiutieziEntity> ew = new EntityWrapper<YouxiutieziEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = youxiutieziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youxiutiezi), params), params));
        return R.ok().put("data", page);
    }










}
