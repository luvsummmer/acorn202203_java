package test.mypac;
/*
 * Ŭ���� �����ϱ�
 * 
 * class�� ����
 * 
 * 1. ��ü�� ���赵 ����
 * 
 * 2. data type ����
 * 
 * 3. static �ʵ�� �޼ҵ带 �����ϴ� ����
 * 
 */
public class Car {
	// �����(field)
	public String name; // ���� �̸��� ������ �� �ִ� ����, Ŭ���� �ȿ��ٰ� ����(field) / ������������(method ��)�̶� ���
	
	// �޸��� ���(method)
	public void drive() {
		System.out.println(this.name+" ��(��) �޷��� ! ! !");
	}
	// ���ߴ� ���(method)
	public void stop() {
		System.out.println("����� ! !");
	}
}
