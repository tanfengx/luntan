package com.dao;

import com.entity.TiezifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiezifenleiVO;
import com.entity.view.TiezifenleiView;


/**
 * 帖子分类
 * 
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
public interface TiezifenleiDao extends BaseMapper<TiezifenleiEntity> {
	
	List<TiezifenleiVO> selectListVO(@Param("ew") Wrapper<TiezifenleiEntity> wrapper);
	
	TiezifenleiVO selectVO(@Param("ew") Wrapper<TiezifenleiEntity> wrapper);
	
	List<TiezifenleiView> selectListView(@Param("ew") Wrapper<TiezifenleiEntity> wrapper);

	List<TiezifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TiezifenleiEntity> wrapper);

	
	TiezifenleiView selectView(@Param("ew") Wrapper<TiezifenleiEntity> wrapper);
	

}
