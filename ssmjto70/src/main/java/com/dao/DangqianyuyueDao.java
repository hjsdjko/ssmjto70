package com.dao;

import com.entity.DangqianyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DangqianyuyueVO;
import com.entity.view.DangqianyuyueView;


/**
 * 当前预约
 * 
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface DangqianyuyueDao extends BaseMapper<DangqianyuyueEntity> {
	
	List<DangqianyuyueVO> selectListVO(@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);
	
	DangqianyuyueVO selectVO(@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);
	
	List<DangqianyuyueView> selectListView(@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);

	List<DangqianyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);
	
	DangqianyuyueView selectView(@Param("ew") Wrapper<DangqianyuyueEntity> wrapper);
	
}
