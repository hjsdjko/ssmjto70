package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DayinjiluDao;
import com.entity.DayinjiluEntity;
import com.service.DayinjiluService;
import com.entity.vo.DayinjiluVO;
import com.entity.view.DayinjiluView;

@Service("dayinjiluService")
public class DayinjiluServiceImpl extends ServiceImpl<DayinjiluDao, DayinjiluEntity> implements DayinjiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DayinjiluEntity> page = this.selectPage(
                new Query<DayinjiluEntity>(params).getPage(),
                new EntityWrapper<DayinjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DayinjiluEntity> wrapper) {
		  Page<DayinjiluView> page =new Query<DayinjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DayinjiluVO> selectListVO(Wrapper<DayinjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DayinjiluVO selectVO(Wrapper<DayinjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DayinjiluView> selectListView(Wrapper<DayinjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DayinjiluView selectView(Wrapper<DayinjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
