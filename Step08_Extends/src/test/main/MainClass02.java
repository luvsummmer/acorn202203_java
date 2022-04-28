package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 지역변수나 필드 앞에 선언하는 data type은 (참조 데이터 type에 한함)
 * 그 안에 들어있는 참조값의 사용 설명서 ! 라고 생각하면 됨
 * 그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용 설명서에 명시된 기능만 사용할 수 있다 !!!
 * 
 * JAVA의 모든 객체는 다형성을 가질 수 있음
 * '다형성' : type이 여러개라는 의미
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		// 다형성 확인 ! !
		HandPhone p1=new HandPhone();		
		// 어떤 객체의 참조값을 부모type으로 받을 수 있음 - 기능의 제약이 생겨버림
		Phone p2=new HandPhone();  // HandPhone type 객체의 참조값을 Phone type에 담음(사용설명서가 여기)
		Object p3=new HandPhone();  // HandPhone type 객체의 참조값을 Object type에 담음
		
		
	}
}
