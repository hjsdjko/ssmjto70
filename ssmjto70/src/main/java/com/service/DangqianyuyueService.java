package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangqianyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangqianyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangqianyuyueView;


/**
 * 当前预约
 *
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface DangqianyuyueService extends IService<DangqianyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangqianyuyueVO> selectListVO(Wrapper<DangqianyuyueEntity> wrapper);
   	
   	DangqianyuyueVO selectVO(@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);
   	
   	List<DangqianyuyueView> selectListView(Wrapper<DangqianyuyueEntity> wrapper);
   	
   	DangqianyuyueView selectView(@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangqianyuyueEntity> wrapper);
   	
}

