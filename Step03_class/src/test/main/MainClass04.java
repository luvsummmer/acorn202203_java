package test.main;

import test.mypac.Member;  // 패키지가 다르니까 import해주기

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Member 객체를 생성해서
		Member m1=new Member();
		// 2. 회원 한명의 정보를 담고
		m1.num=1;
		m1.name="정민";
		m1.addr="서울";
		// 3. showInfo() 메소드를 호출해 보세요.
		m1.showInfo();
	}
}
