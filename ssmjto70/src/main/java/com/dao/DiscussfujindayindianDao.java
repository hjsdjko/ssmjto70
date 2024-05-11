package com.dao;

import com.entity.DiscussfujindayindianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfujindayindianVO;
import com.entity.view.DiscussfujindayindianView;


/**
 * 附近打印店评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public interface DiscussfujindayindianDao extends BaseMapper<DiscussfujindayindianEntity> {
	
	List<DiscussfujindayindianVO> selectListVO(@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);
	
	DiscussfujindayindianVO selectVO(@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);
	
	List<DiscussfujindayindianView> selectListView(@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);

	List<DiscussfujindayindianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);
	
	DiscussfujindayindianView selectView(@Param("ew") Wrapper<DiscussfujindayindianEntity> wrapper);
	
}
