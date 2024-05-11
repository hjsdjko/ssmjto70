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
 * 文件打印
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
@TableName("wenjiandayin")
public class WenjiandayinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenjiandayinEntity() {
		
	}
	
	public WenjiandayinEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 文件名
	 */
					
	private String wenjianming;
	
	/**
	 * 文件
	 */
					
	private String wenjian;
	
	/**
	 * 双面打印
	 */
					
	private String shuangmiandayin;
	
	/**
	 * 打印要求
	 */
					
	private String dayinyaoqiu;
	
	/**
	 * 提交时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tijiaoshijian;
	
	/**
	 * 取件时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qujianshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	
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
	 * 设置：文件名
	 */
	public void setWenjianming(String wenjianming) {
		this.wenjianming = wenjianming;
	}
	/**
	 * 获取：文件名
	 */
	public String getWenjianming() {
		return wenjianming;
	}
	/**
	 * 设置：文件
	 */
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
	/**
	 * 设置：双面打印
	 */
	public void setShuangmiandayin(String shuangmiandayin) {
		this.shuangmiandayin = shuangmiandayin;
	}
	/**
	 * 获取：双面打印
	 */
	public String getShuangmiandayin() {
		return shuangmiandayin;
	}
	/**
	 * 设置：打印要求
	 */
	public void setDayinyaoqiu(String dayinyaoqiu) {
		this.dayinyaoqiu = dayinyaoqiu;
	}
	/**
	 * 获取：打印要求
	 */
	public String getDayinyaoqiu() {
		return dayinyaoqiu;
	}
	/**
	 * 设置：提交时间
	 */
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
	/**
	 * 设置：取件时间
	 */
	public void setQujianshijian(Date qujianshijian) {
		this.qujianshijian = qujianshijian;
	}
	/**
	 * 获取：取件时间
	 */
	public Date getQujianshijian() {
		return qujianshijian;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}

}
