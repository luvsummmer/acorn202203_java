package test.main;

import test.mypac.HandPhone;
/*
 * Phone Ŭ������ ��ӹ��� HandPhone Ŭ������ ��ü�� �����ϸ�
 * �θ� ��ü�� Phone ��ü�� �̸� ��������� �Ŀ� �ڽ� ��ü�� HandPhone ��ü�� ���������.
 * �׸��� �� �ΰ��� ��ü�� ������ heap������ ����Ǿ� ������ ���������� ������ �ȴ�. 
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		p1.call();  // �θ�Ŭ�����κ��� ��ӹ��� ��� ��밡�� - ���� ������, �θ�ü�� ���� �������
		p1.mobileCall();
		p1.takePicture();
		
	}
}
