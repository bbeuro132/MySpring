package org20210809;

public class A {
	
	private int aa;
	//alt + shift + s -> r (getter setter 자동 생성)

	public A() {}
	public A(int aa) {
		super();
		this.aa = aa;
	}
	
	
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	
}
