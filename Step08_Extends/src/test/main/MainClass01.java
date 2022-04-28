package test.main;

import test.mypac.HandPhone;
/*
 * Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성하면
 * 부모 객체인 Phone 객체가 미리 만들어지고 후에 자식 객체인 HandPhone 객체가 만들어진다.
 * 그리고 그 두개의 객체가 동일한 heap영역에 저장되어 동일한 참조값으로 관리가 된다. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		p1.call();  // 부모클래스로부터 상속받은 기능 사용가능 - 같은 참조값, 부모객체가 먼저 만들어짐
		p1.mobileCall();
		p1.takePicture();
		
	}
}
