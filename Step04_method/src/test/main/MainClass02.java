package test.main;

import test.mypac.Messenger;
import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		
		// Messenger Ŭ������ ���� static �޼ҵ� 3���� ȣ���ϴ� code�� �ۼ��� ������.
		// static �޼ҵ� : 'Ŭ������'�� ���� ȣ�� !!! new�ϴ°� �ƴ�
		Messenger.sendMessage("hi");
		Messenger.getMessage();
		Messenger.useCar(new Car());
		
		
		/* �̰� �߸��� ���ٹ�� - �������� ��ü�� ������ ��
		 * Messenger m=new Messenger();
		   m.sendMessage("hi");
		   m.getMessage();
		   m.useCar(new Car());
		 */

	}
}
