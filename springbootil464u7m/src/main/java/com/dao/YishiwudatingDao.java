package com.dao;

import com.entity.YishiwudatingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YishiwudatingVO;
import com.entity.view.YishiwudatingView;


/**
 * 遗失物大厅
 * 
 * @author 
 * @email 
 * @date 2024-03-15 16:12:44
 */
public interface YishiwudatingDao extends BaseMapper<YishiwudatingEntity> {
	
	List<YishiwudatingVO> selectListVO(@Param("ew") Wrapper<YishiwudatingEntity> wrapper);
	
	YishiwudatingVO selectVO(@Param("ew") Wrapper<YishiwudatingEntity> wrapper);
	
	List<YishiwudatingView> selectListView(@Param("ew") Wrapper<YishiwudatingEntity> wrapper);

	List<YishiwudatingView> selectListView(Pagination page,@Param("ew") Wrapper<YishiwudatingEntity> wrapper);

	
	YishiwudatingView selectView(@Param("ew") Wrapper<YishiwudatingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishiwudatingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishiwudatingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YishiwudatingEntity> wrapper);



}
