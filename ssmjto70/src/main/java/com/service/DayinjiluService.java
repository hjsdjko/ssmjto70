package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DayinjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DayinjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DayinjiluView;


/**
 * 打印记录
 *
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface DayinjiluService extends IService<DayinjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DayinjiluVO> selectListVO(Wrapper<DayinjiluEntity> wrapper);
   	
   	DayinjiluVO selectVO(@Param("ew") Wrapper<DayinjiluEntity> wrapper);
   	
   	List<DayinjiluView> selectListView(Wrapper<DayinjiluEntity> wrapper);
   	
   	DayinjiluView selectView(@Param("ew") Wrapper<DayinjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DayinjiluEntity> wrapper);
   	
}

