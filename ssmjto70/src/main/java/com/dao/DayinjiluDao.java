package com.dao;

import com.entity.DayinjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DayinjiluVO;
import com.entity.view.DayinjiluView;


/**
 * 打印记录
 * 
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface DayinjiluDao extends BaseMapper<DayinjiluEntity> {
	
	List<DayinjiluVO> selectListVO(@Param("ew") Wrapper<DayinjiluEntity> wrapper);
	
	DayinjiluVO selectVO(@Param("ew") Wrapper<DayinjiluEntity> wrapper);
	
	List<DayinjiluView> selectListView(@Param("ew") Wrapper<DayinjiluEntity> wrapper);

	List<DayinjiluView> selectListView(Pagination page,@Param("ew") Wrapper<DayinjiluEntity> wrapper);
	
	DayinjiluView selectView(@Param("ew") Wrapper<DayinjiluEntity> wrapper);
	
}
