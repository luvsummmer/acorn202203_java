package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		// HandPhone ��ü�� �����ؼ� �� �������� p1�̶�� �̸��� HandPhone type ���������� �����ϱ�
		HandPhone p1=new HandPhone();
		
		// Phone type�� ���� �غ�, ���� ���� ���� Phone type�� ��������(p2) ����
		// Phone p2=null;
		
		// p1 �ȿ� �ִ� �������� p2��� Phone type ���������� �����ϱ�
		Phone p2=p1;
		
		// p1 �ȿ� �ִ� �������� p3��� Object type ���������� �����ϱ�
		Object p3=p1;
		
		// �ڽ� ��ü�� �������� �θ� type ������ �ʵ忡 �ڿ������� ���� !!
		// p1�� HandPhoneŸ���̴ϱ� Phone, Object�� ���� �θ� ������ �ڿ������� ���� ��
		// ���⼭ ��ü�� 1�� ���� ! �� ��ü�� �������� �� ���� 3���� ���� ��
		
		//Object a=true;
		
		//int result=a+10;
	}
}
