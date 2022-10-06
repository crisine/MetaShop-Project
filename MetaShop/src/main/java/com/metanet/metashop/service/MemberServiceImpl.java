package com.metanet.metashop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.metanet.metashop.domain.MemberVO;
import com.metanet.metashop.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

	private MemberMapper mapper;
	
	@Override
	public void insert(MemberVO member) {
		mapper.insert(member);
	}

	@Override
	public MemberVO selectOneById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNextMemNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberVO> getList() {
		List<MemberVO> memberList = mapper.getList();
		return memberList;
	}

	@Override
	public boolean checkId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
