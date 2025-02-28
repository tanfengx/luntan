package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxiutieziEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxiutieziVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxiutieziView;


/**
 * 优秀帖子
 *
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
public interface YouxiutieziService extends IService<YouxiutieziEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxiutieziVO> selectListVO(Wrapper<YouxiutieziEntity> wrapper);
   	
   	YouxiutieziVO selectVO(@Param("ew") Wrapper<YouxiutieziEntity> wrapper);
   	
   	List<YouxiutieziView> selectListView(Wrapper<YouxiutieziEntity> wrapper);
   	
   	YouxiutieziView selectView(@Param("ew") Wrapper<YouxiutieziEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxiutieziEntity> wrapper);

   	

}

