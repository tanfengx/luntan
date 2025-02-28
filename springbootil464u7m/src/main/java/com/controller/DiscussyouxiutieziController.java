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

import com.entity.DiscussyouxiutieziEntity;
import com.entity.view.DiscussyouxiutieziView;

import com.service.DiscussyouxiutieziService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 优秀帖子评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
@RestController
@RequestMapping("/discussyouxiutiezi")
public class DiscussyouxiutieziController {
    @Autowired
    private DiscussyouxiutieziService discussyouxiutieziService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussyouxiutieziEntity discussyouxiutiezi,
		HttpServletRequest request){
        EntityWrapper<DiscussyouxiutieziEntity> ew = new EntityWrapper<DiscussyouxiutieziEntity>();

		PageUtils page = discussyouxiutieziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyouxiutiezi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussyouxiutieziEntity discussyouxiutiezi, 
		HttpServletRequest request){
        EntityWrapper<DiscussyouxiutieziEntity> ew = new EntityWrapper<DiscussyouxiutieziEntity>();

		PageUtils page = discussyouxiutieziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyouxiutiezi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussyouxiutieziEntity discussyouxiutiezi){
       	EntityWrapper<DiscussyouxiutieziEntity> ew = new EntityWrapper<DiscussyouxiutieziEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussyouxiutiezi, "discussyouxiutiezi")); 
        return R.ok().put("data", discussyouxiutieziService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussyouxiutieziEntity discussyouxiutiezi){
        EntityWrapper< DiscussyouxiutieziEntity> ew = new EntityWrapper< DiscussyouxiutieziEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussyouxiutiezi, "discussyouxiutiezi")); 
		DiscussyouxiutieziView discussyouxiutieziView =  discussyouxiutieziService.selectView(ew);
		return R.ok("查询优秀帖子评论表成功").put("data", discussyouxiutieziView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussyouxiutieziEntity discussyouxiutiezi = discussyouxiutieziService.selectById(id);
        return R.ok().put("data", discussyouxiutiezi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussyouxiutieziEntity discussyouxiutiezi = discussyouxiutieziService.selectById(id);
        return R.ok().put("data", discussyouxiutiezi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussyouxiutieziEntity discussyouxiutiezi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussyouxiutiezi);
        discussyouxiutieziService.insert(discussyouxiutiezi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussyouxiutieziEntity discussyouxiutiezi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(discussyouxiutiezi);
        discussyouxiutieziService.insert(discussyouxiutiezi);
        return R.ok();
    }



     /**
     * 获取用户密保
     */
    @RequestMapping("/security")
    @IgnoreAuth
    public R security(@RequestParam String username){
        DiscussyouxiutieziEntity discussyouxiutiezi = discussyouxiutieziService.selectOne(new EntityWrapper<DiscussyouxiutieziEntity>().eq("", username));
        return R.ok().put("data", discussyouxiutiezi);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussyouxiutieziEntity discussyouxiutiezi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyouxiutiezi);
        discussyouxiutieziService.updateById(discussyouxiutiezi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussyouxiutieziService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussyouxiutieziEntity discussyouxiutiezi, HttpServletRequest request,String pre){
        EntityWrapper<DiscussyouxiutieziEntity> ew = new EntityWrapper<DiscussyouxiutieziEntity>();
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
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussyouxiutieziService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyouxiutiezi), params), params));
        return R.ok().put("data", page);
    }










}
