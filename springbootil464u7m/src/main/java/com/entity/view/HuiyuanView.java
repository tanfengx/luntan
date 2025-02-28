package com.entity.view;

import com.entity.HuiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 会员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-29 12:27:25
 */
@TableName("huiyuan")
public class HuiyuanView  extends HuiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanView(){
	}
 
 	public HuiyuanView(HuiyuanEntity huiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
