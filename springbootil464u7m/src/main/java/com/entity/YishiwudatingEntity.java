package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 遗失物大厅
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-15 16:12:44
 */
@TableName("yishiwudating")
public class YishiwudatingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YishiwudatingEntity() {
		
	}
	
	public YishiwudatingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 物品编号
	 */
					
	private String wupinbianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 物品类型
	 */
					
	private String wupinleixing;
	
	/**
	 * 公交车牌号
	 */
					
	private String gongjiaochepaihao;
	
	/**
	 * 公交车次
	 */
					
	private String gongjiaocheci;
	
	/**
	 * 拾取时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shiqushijian;
	
	/**
	 * 认领状态
	 */
					
	private String renlingzhuangtai;
	
	/**
	 * 详情描述
	 */
					
	private String xiangqingmiaoshu;
	
	/**
	 * 模糊图片
	 */
					
	private String mohutupian;
	
	/**
	 * 认领地址
	 */
					
	private String renlingdizhi;
	
	/**
	 * 咨询电话
	 */
					
	private String zixundianhua;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：物品编号
	 */
	public void setWupinbianhao(String wupinbianhao) {
		this.wupinbianhao = wupinbianhao;
	}
	/**
	 * 获取：物品编号
	 */
	public String getWupinbianhao() {
		return wupinbianhao;
	}
	/**
	 * 设置：物品名称
	 */
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
	/**
	 * 设置：物品类型
	 */
	public void setWupinleixing(String wupinleixing) {
		this.wupinleixing = wupinleixing;
	}
	/**
	 * 获取：物品类型
	 */
	public String getWupinleixing() {
		return wupinleixing;
	}
	/**
	 * 设置：公交车牌号
	 */
	public void setGongjiaochepaihao(String gongjiaochepaihao) {
		this.gongjiaochepaihao = gongjiaochepaihao;
	}
	/**
	 * 获取：公交车牌号
	 */
	public String getGongjiaochepaihao() {
		return gongjiaochepaihao;
	}
	/**
	 * 设置：公交车次
	 */
	public void setGongjiaocheci(String gongjiaocheci) {
		this.gongjiaocheci = gongjiaocheci;
	}
	/**
	 * 获取：公交车次
	 */
	public String getGongjiaocheci() {
		return gongjiaocheci;
	}
	/**
	 * 设置：拾取时间
	 */
	public void setShiqushijian(Date shiqushijian) {
		this.shiqushijian = shiqushijian;
	}
	/**
	 * 获取：拾取时间
	 */
	public Date getShiqushijian() {
		return shiqushijian;
	}
	/**
	 * 设置：认领状态
	 */
	public void setRenlingzhuangtai(String renlingzhuangtai) {
		this.renlingzhuangtai = renlingzhuangtai;
	}
	/**
	 * 获取：认领状态
	 */
	public String getRenlingzhuangtai() {
		return renlingzhuangtai;
	}
	/**
	 * 设置：详情描述
	 */
	public void setXiangqingmiaoshu(String xiangqingmiaoshu) {
		this.xiangqingmiaoshu = xiangqingmiaoshu;
	}
	/**
	 * 获取：详情描述
	 */
	public String getXiangqingmiaoshu() {
		return xiangqingmiaoshu;
	}
	/**
	 * 设置：模糊图片
	 */
	public void setMohutupian(String mohutupian) {
		this.mohutupian = mohutupian;
	}
	/**
	 * 获取：模糊图片
	 */
	public String getMohutupian() {
		return mohutupian;
	}
	/**
	 * 设置：认领地址
	 */
	public void setRenlingdizhi(String renlingdizhi) {
		this.renlingdizhi = renlingdizhi;
	}
	/**
	 * 获取：认领地址
	 */
	public String getRenlingdizhi() {
		return renlingdizhi;
	}
	/**
	 * 设置：咨询电话
	 */
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}

}
