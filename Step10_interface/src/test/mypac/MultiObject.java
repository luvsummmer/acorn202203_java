package test.mypac;
/*
 * �������̽� ���߱������� => implements �ڿ� ������ �������̽��� �����ϱ�
 * �̷��� �������� ��� ��� ������ ������Ÿ���� �� ������ (������) : Object, MultiObject, Remocon, Drill
 * ������ �������� �� ������� �� override���ָ� ��
 */
public class MultiObject implements Remocon, Drill{

	@Override
	public void up() {
		System.out.println("�÷���");
	}

	@Override
	public void down() {
		System.out.println("������");
	}

	@Override
	public void hole() {
		System.out.println("��������");
	}
	
}
