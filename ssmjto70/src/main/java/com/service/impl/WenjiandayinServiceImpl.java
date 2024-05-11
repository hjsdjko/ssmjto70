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


import com.dao.WenjiandayinDao;
import com.entity.WenjiandayinEntity;
import com.service.WenjiandayinService;
import com.entity.vo.WenjiandayinVO;
import com.entity.view.WenjiandayinView;

@Service("wenjiandayinService")
public class WenjiandayinServiceImpl extends ServiceImpl<WenjiandayinDao, WenjiandayinEntity> implements WenjiandayinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjiandayinEntity> page = this.selectPage(
                new Query<WenjiandayinEntity>(params).getPage(),
                new EntityWrapper<WenjiandayinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjiandayinEntity> wrapper) {
		  Page<WenjiandayinView> page =new Query<WenjiandayinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjiandayinVO> selectListVO(Wrapper<WenjiandayinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjiandayinVO selectVO(Wrapper<WenjiandayinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjiandayinView> selectListView(Wrapper<WenjiandayinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjiandayinView selectView(Wrapper<WenjiandayinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
