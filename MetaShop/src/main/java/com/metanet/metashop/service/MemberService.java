package com.metanet.metashop.service;

import java.util.List;

import com.metanet.metashop.domain.MemberVO;

public interface MemberService {

	// 회원 가입
	void insert(MemberVO member);
		
	// 아이디 기준으로 회원 정보 얻어오기
	MemberVO selectOneById(String id);
		
	public int getNextMemNo();
		
	// 전체 회원 정보를 리스트로 얻어오기
	List<MemberVO> getList();
		
	// 중복 가입 방지용 아이디 체크
	boolean checkId(String id);
}
