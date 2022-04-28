package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
/*
 * Casting�ϱ� (�ڽİ�ü�� �θ�ü�� ��� ���)
 */
public class MainClass04 {
	public static void main(String[] args) {
		// SmartPhone ��ü�� �����ؼ� phone type p1�̶�� ���������� ��ƺ�����.
		Phone p1=new SmartPhone();
		// p1�� ����ִ� �������� �̿��ؼ� ��ȭ�� �ɰ� �ʹٸ�?
		p1.call();  // ��� ����� �� ������ ������ ��뼳���� ������ , just call() �� ����
		
		// p1�� ����ִ� �������� �̿��ؼ� �̵� �߿� ��ȭ�� �ɰ� �ʹٸ�? => ���� HandPhone���� �ٲٱ�(casting)
		HandPhone p2=(HandPhone)p1;  // �θ�Ÿ���� �ڽ�Ÿ�Կ� �׳� ����� ���� => casting�ϱ� !! ���� ���� �ڵ����� �´ٰ� �������ֱ�
		p2.mobileCall();
		
		boolean result=p1==p2; // true, ������ �Ȱ����ϱ�!(������ ��ü��) �� ������ ��뼳���� �ٸ�
		
		// p1�� ����ִ� �������� �̿��ؼ� ���ͳ��� �ϰ�ʹٸ�?
		SmartPhone p3=(SmartPhone)p1;  // p1�� Phone�������� SmartPhone�����ϴٰ� �ٲٱ�
		p3.doInternet();
	}
}
