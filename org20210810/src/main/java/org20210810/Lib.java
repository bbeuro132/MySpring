package org20210810;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Lib {
	
	@Autowired
	@Qualifier("aa1")
	AA aa; //aa1이라는 이름을 가진 객체를 사용하겠다
	
	@Autowired
	BB bb;
	
	public void printAA() {
		aa.doAA();
	}
	
	public void printBB() {
		bb.doBB();
	}
	

}
