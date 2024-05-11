package com.entity.vo;

import com.entity.DayinjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 打印记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public class DayinjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
