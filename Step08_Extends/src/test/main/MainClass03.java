package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		// HandPhone 객체를 생성해서 그 참조값을 p1이라는 이름의 HandPhone type 지역변수에 대입하기
		HandPhone p1=new HandPhone();
		
		// Phone type을 담을 준비, 값을 넣지 않은 Phone type의 지역변수(p2) 생성
		// Phone p2=null;
		
		// p1 안에 있는 참조값을 p2라는 Phone type 지역변수에 대입하기
		Phone p2=p1;
		
		// p1 안에 있는 참조값을 p3라는 Object type 지역변수에 대입하기
		Object p3=p1;
		
		// 자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다 !!
		// p1은 HandPhone타입이니까 Phone, Object와 같은 부모 변수에 자연스럽게 담기는 것
		// 여기서 객체는 1개 생성 ! 그 객체의 참조값이 각 변수 3개에 담기는 것
		
		//Object a=true;
		
		//int result=a+10;
	}
}
