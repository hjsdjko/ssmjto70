package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuelishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuelishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuelishiView;


/**
 * 预约历史
 *
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface YuyuelishiService extends IService<YuyuelishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuelishiVO> selectListVO(Wrapper<YuyuelishiEntity> wrapper);
   	
   	YuyuelishiVO selectVO(@Param("ew") Wrapper<YuyuelishiEntity> wrapper);
   	
   	List<YuyuelishiView> selectListView(Wrapper<YuyuelishiEntity> wrapper);
   	
   	YuyuelishiView selectView(@Param("ew") Wrapper<YuyuelishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuelishiEntity> wrapper);
   	
}

