package test.mypac;
/*/
 * ���� Ŭ���� !
 */

// ������ Ŭ����
public class Zoo {
	/*
	 * Ŭ���� �ȿ� ������ �� �ִ� �͵�
	 * ������, �ʵ�, �޼ҵ�, 'Ŭ����'
	 */
	
	// ���� Ŭ����(inner class) : Ŭ���� ���� Ŭ����
	public class Monkey{
		public void say() {
			System.out.println("�ȳ� ���� �����̾� ><");
		}
	}
	// ���� Ŭ����
	public class Tiger{
		public void say() {
			System.out.println("�ȳ� ���� ȣ���̾� ^_^");
		}
	}
	
	// �޼ҵ� - ���� Ŭ������ ��ü�� �����ؼ� ��������
	// getMonkey()�� ȣ���ϸ� Monkey()��ü�� ���� ����
	public Monkey getMonkey() {
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}
