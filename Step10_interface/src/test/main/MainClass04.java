package test.main;

import test.mypac.Remocon;
/*
 * 익명의 이너클래스 (아까는 이름 YourRemocon이라고 있었지만 지금은 없음!)
 * 
 * 메인클래스에서 Remocon 인터페이스의 참조값을 가져오기 위해 "new Remocon() {중괄호 안에 바로 클래스 작성}"
 * new 다음에 있는 게 인터페이스이니까 implements 자동으로 된 것 !
 * (new 다음에 있는 게 클래스이면 extends가 자동으로 된 것임)
 */
public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("올려요");
			}
			
			@Override
			public void down() {
				System.out.println("내려요");
			}
		};
		
		// 이렇게 익명의이너클래스 값을 변수 r1에 담았다가 써도 되고
		useRemocon(r1);
		
		// 변수에 담지 않고 바로 메소드를 실행할 때 매개변수에 new로 값을 만들면서 익명의 이너클래스 작성해도 됨
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("올려요");
			}
			
			@Override
			public void down() {
				System.out.println("내려요");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
