package test.main;
/*
 * �Ʒ��� ���� CarFactory��� �̸��� Ŭ������ ����� ������.
 * CarFactory ��ü�� getCar() ��� �޼ҵ尡 �ְ�,
 * �ش� �޼ҵ带 ȣ���ϸ� Car type ��ü�� �������� �����ϵ��� �޼ҵ带 ����� ������.
 */

import test.mypac.Car;
import test.mypac.CarFactory;

public class MainClass06 {
	public static void main(String[] args) {
		// CarFactory ��ü�� �̿��ؼ� Car��ü�� �������� ���ͼ�
		CarFactory cf=new CarFactory();
		Car car=cf.getCar();  // CarFactory�� getCar �޼ҵ� �ҷ����� (������Ÿ���� Car)
		
		// �� ��ü�� ���� �̸��� �ְ�
		car.name="�غ���";
		
		// drive() �޼ҵ带 ȣ���� ������.
		car.drive();
		
		// �ʿ��� ��ü�� �ٸ� �޼ҵ忡�� �޾ƿ��� ���� !
	}
}
