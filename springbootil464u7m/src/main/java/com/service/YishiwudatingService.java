package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YishiwudatingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YishiwudatingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YishiwudatingView;


/**
 * 遗失物大厅
 *
 * @author 
 * @email 
 * @date 2024-03-15 16:12:44
 */
public interface YishiwudatingService extends IService<YishiwudatingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YishiwudatingVO> selectListVO(Wrapper<YishiwudatingEntity> wrapper);
   	
   	YishiwudatingVO selectVO(@Param("ew") Wrapper<YishiwudatingEntity> wrapper);
   	
   	List<YishiwudatingView> selectListView(Wrapper<YishiwudatingEntity> wrapper);
   	
   	YishiwudatingView selectView(@Param("ew") Wrapper<YishiwudatingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YishiwudatingEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YishiwudatingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YishiwudatingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YishiwudatingEntity> wrapper);



}

