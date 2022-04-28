package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
/*
 * Casting하기 (자식객체에 부모객체를 담는 경우)
 */
public class MainClass04 {
	public static void main(String[] args) {
		// SmartPhone 객체를 생성해서 phone type p1이라는 지역변수에 담아보세요.
		Phone p1=new SmartPhone();
		// p1에 들어있는 참조값을 이용해서 전화를 걸고 싶다면?
		p1.call();  // 모든 기능을 다 가지고 있지만 사용설명서가 구리다 , just call() 만 가능
		
		// p1에 들어있는 참조값을 이용해서 이동 중에 전화를 걸고 싶다면? => 설명서 HandPhone으로 바꾸기(casting)
		HandPhone p2=(HandPhone)p1;  // 부모타입은 자식타입에 그냥 담기지 않음 => casting하기 !! 안의 값이 핸드폰이 맞다고 보장해주기
		p2.mobileCall();
		
		boolean result=p1==p2; // true, 참조값 똑같으니까!(동일한 객체임) 두 변수의 사용설명서만 다름
		
		// p1에 들어있는 참조값을 이용해서 인터넷을 하고싶다면?
		SmartPhone p3=(SmartPhone)p1;  // p1이 Phone설명서지만 SmartPhone가능하다고 바꾸기
		p3.doInternet();
	}
}
