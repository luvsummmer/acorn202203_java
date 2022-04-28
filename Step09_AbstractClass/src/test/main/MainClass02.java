package test.main;

import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// 내가 직접 클래스를 만들고 객체생성을 해서 아래의 useWeapon() 메소드 호출해 보기
		
		Weapon w1=new Gun();	
		MainClass02.useWeapon(w1); // 클래스호출시 클래스명에 점찍기, 메소드 호출하고 ()안에 생성한 객체 인자 전달
	}	
	// 아주 복잡한 동작을 하는 메소드라고 가정 => 우린 그냥 가져와서 쓰기만 하면 됨
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
