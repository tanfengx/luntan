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


import com.dao.DiscussyouxiutieziDao;
import com.entity.DiscussyouxiutieziEntity;
import com.service.DiscussyouxiutieziService;
import com.entity.vo.DiscussyouxiutieziVO;
import com.entity.view.DiscussyouxiutieziView;

@Service("discussyouxiutieziService")
public class DiscussyouxiutieziServiceImpl extends ServiceImpl<DiscussyouxiutieziDao, DiscussyouxiutieziEntity> implements DiscussyouxiutieziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxiutieziEntity> page = this.selectPage(
                new Query<DiscussyouxiutieziEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxiutieziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxiutieziEntity> wrapper) {
		  Page<DiscussyouxiutieziView> page =new Query<DiscussyouxiutieziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussyouxiutieziVO> selectListVO(Wrapper<DiscussyouxiutieziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxiutieziVO selectVO(Wrapper<DiscussyouxiutieziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxiutieziView> selectListView(Wrapper<DiscussyouxiutieziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxiutieziView selectView(Wrapper<DiscussyouxiutieziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
