package com.entity.view;

import com.entity.DiscussyouxiutieziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 优秀帖子评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
@TableName("discussyouxiutiezi")
public class DiscussyouxiutieziView  extends DiscussyouxiutieziEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyouxiutieziView(){
	}
 
 	public DiscussyouxiutieziView(DiscussyouxiutieziEntity discussyouxiutieziEntity){
 	try {
			BeanUtils.copyProperties(this, discussyouxiutieziEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
