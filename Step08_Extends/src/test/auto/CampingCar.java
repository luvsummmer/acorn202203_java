package test.auto;

public class CampingCar extends Car {

	public CampingCar(Engine engine) {
		// super() => �θ�Ŭ������ �����ڸ� ȣ���ϴ� �� ! �ֿ켱���� ����� ��
		// �ڽĻ����ڿ��� �޾Ƽ� �θ�����ڿ��� �������� ��������� ��
		super(engine);
	}

	// �޼ҵ�
	public void sleepInCar() {
		System.out.println("������ ���� �ڿ� zzZ");
	}
}
