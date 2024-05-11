package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FujindayindianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FujindayindianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FujindayindianView;


/**
 * 附近打印店
 *
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface FujindayindianService extends IService<FujindayindianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FujindayindianVO> selectListVO(Wrapper<FujindayindianEntity> wrapper);
   	
   	FujindayindianVO selectVO(@Param("ew") Wrapper<FujindayindianEntity> wrapper);
   	
   	List<FujindayindianView> selectListView(Wrapper<FujindayindianEntity> wrapper);
   	
   	FujindayindianView selectView(@Param("ew") Wrapper<FujindayindianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FujindayindianEntity> wrapper);
   	
}

