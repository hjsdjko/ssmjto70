package com.entity.model;

import com.entity.WenjiandayinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 文件打印
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public class WenjiandayinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
