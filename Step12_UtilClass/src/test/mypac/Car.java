package test.mypac;

public class Car {
	// �ʵ�
	private String name;
	
	// ������ (���ڷ� �ڵ����̸� ����)
	public Car(String name) {
		this.name=name;
	}
	
	// �޼ҵ�
	public void drive() {
		System.out.println(this.name+" ��(��) �θ��θ� �޷��� !!");
	}
}
