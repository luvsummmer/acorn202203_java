package test.main;

import test.mypac.Remocon;
/*
 * 인터페이스를 구현하는 이너클래스 (이름있음 : YourRemocon)
 * 여기서 YourRemocon 클래스 => MainClass03의 이너클래스이고 Remocon 클래스를 구현하고 있다
 */
public class MainClass03 {
	
	static class YourRemocon implements Remocon {
		@Override
		public void up() {
			System.out.println("무언가를 올려요");
		}

		@Override
		public void down() {
			System.out.println("무언가를 내려요");
		}
		
	}
	
	// 메인메소드 - 이너클래스 YourRemocon의 참조값 생성하고 r1에 담기, 데이터타입은 Remocon !
	// 그 변수 r1을 아까 만들어둔 메소드 useRemocon의 매개변수값으로 주고 실행
	public static void main(String[] args) {
		Remocon r1=new YourRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
