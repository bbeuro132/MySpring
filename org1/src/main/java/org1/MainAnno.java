package org1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnno {

	public static void main(String[] args) {
		/*
		 * MainAnno 실행하는 메인
		 * AnnoConfig 객체 조립통
		 * pom.xml -> maven 서버와 통신해서 jar 파일 가져오는 곳
		 * 
		 * */
		AnnotationConfigApplicationContext acac =
				new AnnotationConfigApplicationContext(AnnoConf.class);
		MemberService ms = acac.getBean(MemberService.class);
		ms.insert("홍길동", 10);
		ms.insert("김길동", 20);
		ms.dolist();
		
		acac.close();
	}
	
}
