package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();  // 생성자가 없어도 에러X => 기본생성자가 있다고 간주되기 때문
		s1.study();
		
		new Student().study();
		new Student().goSchool();		
		
		// 생성되자마자 필드에 회원정보 다 들어있게 됨
		Member m1=new Member(1, "김구라", "노량진"); 
		Member m2=new Member(2, "해골", "행신동"); 
		Member m3=new Member(); // num 0, 나머지는 null 들어있음
		
		// new Member(); => 생성자를 하나라도 정의하면 기본 생성자는 사라짐 !
		// 근데 기본생성자도 사용하고 싶으면 다시 정의하면 됨 => Member 클래스에다가
		

	}
}
