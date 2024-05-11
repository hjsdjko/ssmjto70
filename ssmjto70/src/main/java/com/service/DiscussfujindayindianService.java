package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfujindayindianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfujindayindianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfujindayindianView;


/**
 * 附近打印店评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface DiscussfujindayindianService extends IService<DiscussfujindayindianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfujindayindianVO> selectListVO(Wrapper<DiscussfujindayindianEntity> wrapper);
   	
   	DiscussfujindayindianVO selectVO(@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);
   	
   	List<DiscussfujindayindianView> selectListView(Wrapper<DiscussfujindayindianEntity> wrapper);
   	
   	DiscussfujindayindianView selectView(@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfujindayindianEntity> wrapper);
   	
}

