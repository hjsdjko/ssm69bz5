package com.entity.view;

import com.entity.HuiyuanzhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员专区
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 10:55:58
 */
@TableName("huiyuanzhuanqu")
public class HuiyuanzhuanquView  extends HuiyuanzhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanzhuanquView(){
	}
 
 	public HuiyuanzhuanquView(HuiyuanzhuanquEntity huiyuanzhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanzhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
