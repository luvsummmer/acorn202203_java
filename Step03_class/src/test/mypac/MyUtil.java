	package test.mypac;

public class MyUtil {
	
	// static 찍음 : MyUtil은 static영역, version이라는 저장소랑 send라는 메소드가 있는 것
	
	// 필드
	public static String version;  // 참조데이터타입 : 선언만 하면 null이 들어있음 => 나중에 참조값 들어갈 예정(heap영역 객체를 찾을)
	
	// 메소드
	public static void send( ) {
		System.out.println("전송합니당");
	}
}
