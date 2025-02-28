package com.dao;

import com.entity.YouxiutieziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxiutieziVO;
import com.entity.view.YouxiutieziView;


/**
 * 优秀帖子
 * 
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
public interface YouxiutieziDao extends BaseMapper<YouxiutieziEntity> {
	
	List<YouxiutieziVO> selectListVO(@Param("ew") Wrapper<YouxiutieziEntity> wrapper);
	
	YouxiutieziVO selectVO(@Param("ew") Wrapper<YouxiutieziEntity> wrapper);
	
	List<YouxiutieziView> selectListView(@Param("ew") Wrapper<YouxiutieziEntity> wrapper);

	List<YouxiutieziView> selectListView(Pagination page,@Param("ew") Wrapper<YouxiutieziEntity> wrapper);

	
	YouxiutieziView selectView(@Param("ew") Wrapper<YouxiutieziEntity> wrapper);
	

}
