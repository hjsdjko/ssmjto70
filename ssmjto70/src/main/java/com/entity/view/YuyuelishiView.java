package com.entity.view;

import com.entity.YuyuelishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约历史
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
@TableName("yuyuelishi")
public class YuyuelishiView  extends YuyuelishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuelishiView(){
	}
 
 	public YuyuelishiView(YuyuelishiEntity yuyuelishiEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuelishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
