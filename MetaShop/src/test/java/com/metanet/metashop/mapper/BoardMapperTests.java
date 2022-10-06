package com.metanet.metashop.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 현재 테스트 코드가 스프링을 실행하는 역할을 할 것이다 라는 것을 나타냄
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 지정된 클래스나 문자열을 이용해 필요한 객체들을 스프링내에 객체로 등록합니다.
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));	
	}
}
