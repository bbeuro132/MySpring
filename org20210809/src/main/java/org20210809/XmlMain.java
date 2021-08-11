package org20210809;

import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlMain {

	public static void main(String[] args) {
		GenericXmlApplicationContext gxac =
				new GenericXmlApplicationContext("classpath:XmlConf.xml");
		
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
