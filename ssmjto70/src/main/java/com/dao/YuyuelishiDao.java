package com.dao;

import com.entity.YuyuelishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuelishiVO;
import com.entity.view.YuyuelishiView;


/**
 * 预约历史
 * 
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface YuyuelishiDao extends BaseMapper<YuyuelishiEntity> {
	
	List<YuyuelishiVO> selectListVO(@Param("ew") Wrapper<YuyuelishiEntity> wrapper);
	
	YuyuelishiVO selectVO(@Param("ew") Wrapper<YuyuelishiEntity> wrapper);
	
	List<YuyuelishiView> selectListView(@Param("ew") Wrapper<YuyuelishiEntity> wrapper);

	List<YuyuelishiView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuelishiEntity> wrapper);
	
	YuyuelishiView selectView(@Param("ew") Wrapper<YuyuelishiEntity> wrapper);
	
}
