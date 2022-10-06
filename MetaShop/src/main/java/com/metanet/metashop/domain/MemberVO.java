package com.metanet.metashop.domain;

import lombok.Data;

@Data
public class MemberVO {
	
	private int memNo;
	private String id;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String postCode;
	private String address;
	private String addressDetail;

}
