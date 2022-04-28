package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	// 내부 클래스(inner class) - 상속받고 있음
	static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("공중 공격을 해요 !");
		}
		
	}
	// static main() 메소드
	public static void main(String[] args) {
		Weapon w1=new YourWeapon();
		useWeapon(w1); // 패키지에 파일을 따로 만들지 않고 내부클래스로 간단히 만들기 가능, 근데 메인메소드에서 쓰려고 하니까 메인static=> 내부클래스에도 static 붙여준 것
		
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("지겹다 이제 아무나 공격하자 ㅋㅋ");
			}
		}
		
		Weapon w2=new OurWeapon(); // 이건 로컬이어서 바로 실행가능
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
