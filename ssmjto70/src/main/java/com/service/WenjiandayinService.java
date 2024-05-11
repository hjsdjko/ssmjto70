package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjiandayinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjiandayinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjiandayinView;


/**
 * 文件打印
 *
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface WenjiandayinService extends IService<WenjiandayinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjiandayinVO> selectListVO(Wrapper<WenjiandayinEntity> wrapper);
   	
   	WenjiandayinVO selectVO(@Param("ew") Wrapper<WenjiandayinEntity> wrapper);
   	
   	List<WenjiandayinView> selectListView(Wrapper<WenjiandayinEntity> wrapper);
   	
   	WenjiandayinView selectView(@Param("ew") Wrapper<WenjiandayinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjiandayinEntity> wrapper);
   	
}

