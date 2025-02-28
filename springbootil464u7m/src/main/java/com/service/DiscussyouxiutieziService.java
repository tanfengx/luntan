package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxiutieziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxiutieziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxiutieziView;


/**
 * 优秀帖子评论表
 *
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
public interface DiscussyouxiutieziService extends IService<DiscussyouxiutieziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxiutieziVO> selectListVO(Wrapper<DiscussyouxiutieziEntity> wrapper);
   	
   	DiscussyouxiutieziVO selectVO(@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);
   	
   	List<DiscussyouxiutieziView> selectListView(Wrapper<DiscussyouxiutieziEntity> wrapper);
   	
   	DiscussyouxiutieziView selectView(@Param("ew") Wrapper<DiscussyouxiutieziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxiutieziEntity> wrapper);

   	

}

