package com.dao;

import com.entity.FujindayindianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FujindayindianVO;
import com.entity.view.FujindayindianView;


/**
 * 附近打印店
 * 
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface FujindayindianDao extends BaseMapper<FujindayindianEntity> {
	
	List<FujindayindianVO> selectListVO(@Param("ew") Wrapper<FujindayindianEntity> wrapper);
	
	FujindayindianVO selectVO(@Param("ew") Wrapper<FujindayindianEntity> wrapper);
	
	List<FujindayindianView> selectListView(@Param("ew") Wrapper<FujindayindianEntity> wrapper);

	List<FujindayindianView> selectListView(Pagination page,@Param("ew") Wrapper<FujindayindianEntity> wrapper);
	
	FujindayindianView selectView(@Param("ew") Wrapper<FujindayindianEntity> wrapper);
	
}
