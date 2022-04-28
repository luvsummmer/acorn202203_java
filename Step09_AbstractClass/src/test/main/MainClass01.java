package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * [ 추상클래스 (Abstract Class) ]
 * 
 * - class 예약어 앞에 abstract를 명시해서 클래스를 정의함
 * - 메소드 중에 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할 수 있음
 * - 형태만 정의된 메소드를 만들 때는 abstract 예약어를 붙여서 메소드를 정의함
 * - 생성자는 존재하지만 단독으로 객체 생성은 불가 ! => new Weapon() 불가능
 * - 추상클래스 type의 id가 필요할 경우에는 추상클래스를 상속받은 자식클래스를 정의해서 객체를 생성해야 함
 * - 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 override(재정의)해야 함
 */
public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1=new MyWeapon(); // 자식객체 MyWeapon에서 오버라이드 한 후 여기로 와서 new하기, 이제 자식객체가 부모타입의 역할을 대신함
		w1.prepare();
		w1.attack();
		
		
	}
}
