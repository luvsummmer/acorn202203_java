package test.auto;

/*
 * Car Ŭ���� ��ӹ޾Ƽ� ���ϴ� �� �����
 */
public class RacingCar extends Car {

	// �θ�Ŭ���� ������ ȣ��
	public RacingCar(Engine engine) {
		super(engine);
	}


	@Override //(������ �θ�޼ҵ尡 �ʿ��ϴٸ� super ����)
	public void drive() {
		
		/*
		 * ������(�������̵�)�� �θ�޼ҵ带 ȣ���ؾ� ���� ������ ��Ȳ�� ���� �ٸ�
		 * �θ��� �޼ҵ带 ȣ���� ���� ������ ��ü�� ����� �������� �ʴ� ��쵵 ����
		 * => �׷� ��쿡 �θ��� �޼ҵ带 �ݵ�� ȣ�����־�� ��
		 */
		super.drive(); // �θ��� �޼ҵ�, super�� �θ��ϼ��� �θ��� ��ü�ϼ��� ����
		System.out.println("���� �� ������ �ٿ��� ��û ������ �޷���");
		
	}
		
		
	
}
