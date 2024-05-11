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
 * 打印记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
@TableName("dayinjilu")
public class DayinjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DayinjiluEntity() {
		
	}
	
	public DayinjiluEntity(T t) {
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
	 * 打印总价
	 */
					
	private Integer dayinzongjia;
	
	/**
	 * 打印时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dayinshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：打印总价
	 */
	public void setDayinzongjia(Integer dayinzongjia) {
		this.dayinzongjia = dayinzongjia;
	}
	/**
	 * 获取：打印总价
	 */
	public Integer getDayinzongjia() {
		return dayinzongjia;
	}
	/**
	 * 设置：打印时间
	 */
	public void setDayinshijian(Date dayinshijian) {
		this.dayinshijian = dayinshijian;
	}
	/**
	 * 获取：打印时间
	 */
	public Date getDayinshijian() {
		return dayinshijian;
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

}
