package org1;

public class Member { //member의 정보가 담겨있는 클래스파일
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
