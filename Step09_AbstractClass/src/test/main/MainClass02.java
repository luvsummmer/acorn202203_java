package test.main;

import test.mypac.Gun;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// ���� ���� Ŭ������ ����� ��ü������ �ؼ� �Ʒ��� useWeapon() �޼ҵ� ȣ���� ����
		
		Weapon w1=new Gun();	
		MainClass02.useWeapon(w1); // Ŭ����ȣ��� Ŭ������ �����, �޼ҵ� ȣ���ϰ� ()�ȿ� ������ ��ü ���� ����
	}	
	// ���� ������ ������ �ϴ� �޼ҵ��� ���� => �츰 �׳� �����ͼ� ���⸸ �ϸ� ��
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
