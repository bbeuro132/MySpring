package org20210809;

import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlMain2 {
	
	/*
	 * xml
	 * 생성자 방식으로 DI (Dependency Injection)
	 * set 방식으로 DI
	 * Dependency Injection :
	 * 외부에서 두 객체 간의 관계를 결정해주는 디자인 패턴으로, 
	 * 인터페이스를 사이에 둬서 클래스 레벨에서는 의존관계가 고정되지 않도록 하고 
	 * 런타임 시에 관계를 다이나믹하게 주입하여 유연성을 확보하고 결합도를 낮출 수 있게 해준다.
	 * 
	 * */

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:XmlConf2.xml");
		
		A a = gxac.getBean(A.class);
		A a1 = gxac.getBean(A.class);
		B b = gxac.getBean(B.class);
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(b);
		
		System.out.println(a1.getAa());
		a1.setAa(200);
		System.out.println(a.getAa());
		a1.setAa(500);
		
		
		System.out.println(b.getA().getAa());
		
		gxac.close();

	}

}
