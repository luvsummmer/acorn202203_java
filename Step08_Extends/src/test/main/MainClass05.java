package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
/*
 * class Exception�� �߻��ϴ� ���
 */
public class MainClass05 {
	public static void main(String[] args) {
		
		// �ڽĿ��� ���� �Ϲ� �ڵ���(���ͳ��� �ȵ�) ���� SmartPhone�� �ƴ϶� �������� HandPhone�̾���
		HandPhone p1=new HandPhone();  //Phone p1=new SmartPhone(); �̾�� ��
		
		// ���� ! ���� SmartPhone ������� !!!
		
		// ������ ���ο� ������ ������ �Կ� ���� ������ SmartPhone�̾� ~~! (��� �������� ������ ��ü�� ��)
		// �� ClassCastException �߻� !
		SmartPhone p2=(SmartPhone)p1;
		
		// ��¥ ? ���� ¯�̴� !!! �� ���� ���ͳ� �Ұ�� !
		p2.doInternet();  // ���ȵ� ���� ���ʿ� ĳ���õ� �ȵȰ��� (���� ������ ��ü�� ������ �߿�)
	}
}
