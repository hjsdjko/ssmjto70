package com.dao;

import com.entity.WenjiandayinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjiandayinVO;
import com.entity.view.WenjiandayinView;


/**
 * 文件打印
 * 
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface WenjiandayinDao extends BaseMapper<WenjiandayinEntity> {
	
	List<WenjiandayinVO> selectListVO(@Param("ew") Wrapper<WenjiandayinEntity> wrapper);
	
	WenjiandayinVO selectVO(@Param("ew") Wrapper<WenjiandayinEntity> wrapper);
	
	List<WenjiandayinView> selectListView(@Param("ew") Wrapper<WenjiandayinEntity> wrapper);

	List<WenjiandayinView> selectListView(Pagination page,@Param("ew") Wrapper<WenjiandayinEntity> wrapper);
	
	WenjiandayinView selectView(@Param("ew") Wrapper<WenjiandayinEntity> wrapper);
	
}
