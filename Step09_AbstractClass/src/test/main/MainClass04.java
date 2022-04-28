package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	// ���� Ŭ����(inner class) - ��ӹް� ����
	static class YourWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("���� ������ �ؿ� !");
		}
		
	}
	// static main() �޼ҵ�
	public static void main(String[] args) {
		Weapon w1=new YourWeapon();
		useWeapon(w1); // ��Ű���� ������ ���� ������ �ʰ� ����Ŭ������ ������ ����� ����, �ٵ� ���θ޼ҵ忡�� ������ �ϴϱ� ����static=> ����Ŭ�������� static �ٿ��� ��
		
		class OurWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("����� ���� �ƹ��� �������� ����");
			}
		}
		
		Weapon w2=new OurWeapon(); // �̰� �����̾ �ٷ� ���డ��
		useWeapon(w2);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
