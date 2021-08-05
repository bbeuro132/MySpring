package org;

/*
 * group id com.mh
 * */

public class main {

	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println(aa);
		AA aa1 = new AA();
		System.out.println(aa1);
		
		AA aa2 = AA.getInstance();
		System.out.println(aa2);
		
		AA aa3 = AA.getInstance();
		System.out.println(aa3);
	}

}
