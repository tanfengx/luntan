package com.entity.view;

import com.entity.YouxiutieziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 优秀帖子
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
@TableName("youxiutiezi")
public class YouxiutieziView  extends YouxiutieziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxiutieziView(){
	}
 
 	public YouxiutieziView(YouxiutieziEntity youxiutieziEntity){
 	try {
			BeanUtils.copyProperties(this, youxiutieziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
