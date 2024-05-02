package com.dao;

import com.entity.HuiyuanzhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanzhuanquVO;
import com.entity.view.HuiyuanzhuanquView;


/**
 * 会员专区
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:55:58
 */
public interface HuiyuanzhuanquDao extends BaseMapper<HuiyuanzhuanquEntity> {
	
	List<HuiyuanzhuanquVO> selectListVO(@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);
	
	HuiyuanzhuanquVO selectVO(@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);
	
	List<HuiyuanzhuanquView> selectListView(@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);

	List<HuiyuanzhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);
	
	HuiyuanzhuanquView selectView(@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);
	
}
