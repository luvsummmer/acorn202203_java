package test.main;

import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		
		// Messenger 클래스에 만든 static 메소드 3개를 호출하는 code를 작성해 보세요.
		// static 메소드 : '클래스명'에 점찍어서 호출 !!! new하는게 아님
		Messenger.sendMessage("hi");
		Messenger.getMessage();
		Messenger.useCar(new Car());
		
		
		/* 이건 잘못된 접근방법 - 쓸데없는 객체를 생성한 것
		 * Messenger m=new Messenger();
		   m.sendMessage("hi");
		   m.getMessage();
		   m.useCar(new Car());
		 */

	}
}
