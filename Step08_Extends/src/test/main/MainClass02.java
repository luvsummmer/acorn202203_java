package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * ���������� �ʵ� �տ� �����ϴ� data type�� (���� ������ type�� ����)
 * �� �ȿ� ����ִ� �������� ��� ���� ! ��� �����ϸ� ��
 * �׷��� ������ �� ���������� �ʵ忡 . �� ������ ��� ������ ��õ� ��ɸ� ����� �� �ִ� !!!
 * 
 * JAVA�� ��� ��ü�� �������� ���� �� ����
 * '������' : type�� ��������� �ǹ�
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		
		// ������ Ȯ�� ! !
		HandPhone p1=new HandPhone();		
		// � ��ü�� �������� �θ�type���� ���� �� ���� - ����� ������ ���ܹ���
		Phone p2=new HandPhone();  // HandPhone type ��ü�� �������� Phone type�� ����(��뼳���� ����)
		Object p3=new HandPhone();  // HandPhone type ��ü�� �������� Object type�� ����
		
		
	}
}
