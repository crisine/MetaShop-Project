package com.metanet.metashop.mapper;

import java.util.List;

import com.metanet.metashop.domain.BoardVO;

public interface BoardMapper {
	
	// @Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
}

