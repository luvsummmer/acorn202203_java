package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
/*
 * [ �߻�Ŭ���� (Abstract Class) ]
 * 
 * - class ����� �տ� abstract�� ����ؼ� Ŭ������ ������
 * - �޼ҵ� �߿� ���¸� ���ǵǰ� ���� ������ ���� ���� �޼ҵ尡 ������ �� ����
 * - ���¸� ���ǵ� �޼ҵ带 ���� ���� abstract ���� �ٿ��� �޼ҵ带 ������
 * - �����ڴ� ���������� �ܵ����� ��ü ������ �Ұ� ! => new Weapon() �Ұ���
 * - �߻�Ŭ���� type�� id�� �ʿ��� ��쿡�� �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ �����ؼ� ��ü�� �����ؾ� ��
 * - �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ������ �θ��� �߻�޼ҵ带 ��� override(������)�ؾ� ��
 */
public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1=new MyWeapon(); // �ڽİ�ü MyWeapon���� �������̵� �� �� ����� �ͼ� new�ϱ�, ���� �ڽİ�ü�� �θ�Ÿ���� ������ �����
		w1.prepare();
		w1.attack();
		
		
	}
}
