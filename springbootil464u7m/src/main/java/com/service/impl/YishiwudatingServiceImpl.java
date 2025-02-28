package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YishiwudatingDao;
import com.entity.YishiwudatingEntity;
import com.service.YishiwudatingService;
import com.entity.vo.YishiwudatingVO;
import com.entity.view.YishiwudatingView;

@Service("yishiwudatingService")
public class YishiwudatingServiceImpl extends ServiceImpl<YishiwudatingDao, YishiwudatingEntity> implements YishiwudatingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishiwudatingEntity> page = this.selectPage(
                new Query<YishiwudatingEntity>(params).getPage(),
                new EntityWrapper<YishiwudatingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishiwudatingEntity> wrapper) {
		  Page<YishiwudatingView> page =new Query<YishiwudatingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YishiwudatingVO> selectListVO(Wrapper<YishiwudatingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishiwudatingVO selectVO(Wrapper<YishiwudatingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishiwudatingView> selectListView(Wrapper<YishiwudatingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishiwudatingView selectView(Wrapper<YishiwudatingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YishiwudatingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YishiwudatingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YishiwudatingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
