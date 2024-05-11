package com.entity.view;

import com.entity.DangqianyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 当前预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
@TableName("dangqianyuyue")
public class DangqianyuyueView  extends DangqianyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangqianyuyueView(){
	}
 
 	public DangqianyuyueView(DangqianyuyueEntity dangqianyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, dangqianyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
