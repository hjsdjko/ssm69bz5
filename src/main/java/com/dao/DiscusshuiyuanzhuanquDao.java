package com.dao;

import com.entity.DiscusshuiyuanzhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuiyuanzhuanquVO;
import com.entity.view.DiscusshuiyuanzhuanquView;


/**
 * 会员专区评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:55:59
 */
public interface DiscusshuiyuanzhuanquDao extends BaseMapper<DiscusshuiyuanzhuanquEntity> {
	
	List<DiscusshuiyuanzhuanquVO> selectListVO(@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
	
	DiscusshuiyuanzhuanquVO selectVO(@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
	
	List<DiscusshuiyuanzhuanquView> selectListView(@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);

	List<DiscusshuiyuanzhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
	
	DiscusshuiyuanzhuanquView selectView(@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
	
}
