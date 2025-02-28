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


import com.dao.YouxiutieziDao;
import com.entity.YouxiutieziEntity;
import com.service.YouxiutieziService;
import com.entity.vo.YouxiutieziVO;
import com.entity.view.YouxiutieziView;

@Service("youxiutieziService")
public class YouxiutieziServiceImpl extends ServiceImpl<YouxiutieziDao, YouxiutieziEntity> implements YouxiutieziService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxiutieziEntity> page = this.selectPage(
                new Query<YouxiutieziEntity>(params).getPage(),
                new EntityWrapper<YouxiutieziEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxiutieziEntity> wrapper) {
		  Page<YouxiutieziView> page =new Query<YouxiutieziView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YouxiutieziVO> selectListVO(Wrapper<YouxiutieziEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxiutieziVO selectVO(Wrapper<YouxiutieziEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxiutieziView> selectListView(Wrapper<YouxiutieziEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxiutieziView selectView(Wrapper<YouxiutieziEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
