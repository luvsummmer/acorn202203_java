package test.mypac;

public class MyWeapon extends Weapon {

	// 추상클래스의 자식클래스를 만들면서 오버라이드(강제됨), 미완성된 부분 해결해주기 (내 마음대로 만들기)
	@Override
	public void attack() {
		System.out.println("내 마음대로 공격해요 !");
	}
	
}
