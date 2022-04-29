package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. member 객체를 담을 수 있는 ArrayList 객체를 생성해서
		// 참조값을 members라는 지역변수에 담아보세요.
		List<Member> members=new ArrayList<>(); // Generic 지정 안하면 Object type으로 뜸, 그럼 캐스팅해와야 함
		
		// 2. 3명의 회원정보를 Member객체에 각각 담아보세요. (Member객체가 3개 생성되어야 함)
		
		Member m1=new Member(1, "김구라", "노량진");
		Member m2=new Member(2, "해골", "행신동");
		Member m3=new Member(3, "원숭이", "오디야");

		
		//필드를 직접 참조해서 넣을 수도 있음 - 접근지정자 public이어서 아예 다른 패키지에 있는 필드를 참조가능
		// m1.num="3";
		// m1.name="원숭이";
		// m1.addr="상도동";
		// members.add(m1);
		
		// 3. 위에서 생성된 Member객체의 참조값을 members List객체에 모두 담아보세요.
		
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		/*
		 *  4. members List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로
		 *  반복문을 돌면서 출력해보세요.
		 *  
		 *  번호: 1, 이름: 김구라, 주소: 노량진
		 *  번호: 2, 이름: 해골, 주소: 행신동
		 */
		for(Member tmp:members) {
			System.out.println("번호: "+tmp.num+", 이름: "+tmp.name+", 주소: "+tmp.addr);
		}
	}
}
