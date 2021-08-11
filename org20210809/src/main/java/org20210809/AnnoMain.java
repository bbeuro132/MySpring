package org20210809;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoMain {

	/*
	 * AnnoMain -> 메인함수 실행
	 * AnnotationConfigApplicationContext == 객체담는 통
	 * AnnoConf == 객체 설정정보를 담은 클래스
	 * A 클래스 == 객체를 담는 통 안에 들어갈 클래스
	 * B 클래스 == 또한 객체를 담는 통 안에 들어갈 클래스 (만든다는 가정 하에)
	 * 
	 * */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac
			= new AnnotationConfigApplicationContext(AnnoConf.class);

	//싱글톤 패턴 : 메모리 안에 하나만 존재하도록 하는 패턴
	A a = acac.getBean(A.class);
	B b = acac.getBean(B.class);
	
	a.setAa(100);
	b.setA(a);
	
	System.out.println(a);
	System.out.println(b.getA().getAa());
	
	acac.close();
	}

}
