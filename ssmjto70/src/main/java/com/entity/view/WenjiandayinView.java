package com.entity.view;

import com.entity.WenjiandayinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文件打印
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
@TableName("wenjiandayin")
public class WenjiandayinView  extends WenjiandayinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenjiandayinView(){
	}
 
 	public WenjiandayinView(WenjiandayinEntity wenjiandayinEntity){
 	try {
			BeanUtils.copyProperties(this, wenjiandayinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
