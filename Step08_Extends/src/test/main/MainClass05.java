package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
/*
 * class Exception이 발생하는 경우
 */
public class MainClass05 {
	public static void main(String[] args) {
		
		// 자식에게 사준 일반 핸드폰(인터넷이 안됨) 원래 SmartPhone이 아니라 원래부터 HandPhone이었음
		HandPhone p1=new HandPhone();  //Phone p1=new SmartPhone(); 이어야 함
		
		// 엄마 ! 나도 SmartPhone 갖고시포 !!!
		
		// 엄마가 새로운 설명서를 가지고 왔오 이제 그폰은 SmartPhone이야 ~~! (사실 구형폰에 설명서만 교체한 것)
		// 는 ClassCastException 발생 !
		SmartPhone p2=(SmartPhone)p1;
		
		// 진짜 ? 엄마 짱이당 !!! 나 이제 인터넷 할고야 !
		p2.doInternet();  // 말안됨 ㅋㅋ 애초에 캐스팅도 안된거임 (원래 생성된 객체가 뭐인지 중요)
	}
}
