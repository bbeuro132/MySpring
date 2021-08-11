package com.mh.org2.cls;

public class AA {
	private int aa;
	private int bb;
	
	//자바 문법상 기본 생성자는 생략 가능
	
	public AA(int aa, int bb) {
		super();
		this.aa = aa;
		this.bb = bb;
	}
	
	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
}
