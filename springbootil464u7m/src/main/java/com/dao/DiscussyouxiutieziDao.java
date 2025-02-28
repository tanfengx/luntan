package com.dao;

import com.entity.DiscussyouxiutieziEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxiutieziVO;
import com.entity.view.DiscussyouxiutieziView;


/**
 * 优秀帖子评论表
 * 
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
public interface DiscussyouxiutieziDao extends BaseMapper<DiscussyouxiutieziEntity> {
	
	List<DiscussyouxiutieziVO> selectListVO(@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);
	
	DiscussyouxiutieziVO selectVO(@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);
	
	List<DiscussyouxiutieziView> selectListView(@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);

	List<DiscussyouxiutieziView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);

	
	DiscussyouxiutieziView selectView(@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);
	

}
