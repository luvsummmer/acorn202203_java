package test.auto;
/*
 *  - ���� ������ ���ٹ���
 * 
 * public : ��𿡼��� ���� ����
 * protected : ������ package Ȥ�� ��Ӱ��迡�� �ڽĿ��� ���� ����
 * default : ������ package �ȿ����� ���� ����
 * private : ������ Ŭ���� Ȥ�� ������ ��ü �ȿ����� ���� ����
 * 
 *  - ���� �����ڸ� ���̴� ��ġ
 * 1. Ŭ������ ������ ��
 * 2. ������ (new�� �� �� �ִ� ��ġ)
 * 3. �ʵ�
 * 4. �޼ҵ�
 * 
 * Ŭ������ default�� public, �ΰ��� ���� �����ڸ� ���� ���� (import ���� ����)
 * ���� ������ ������ �� : default ����������
 */
public class Car {
	// �ʵ� - ���� �����ϱ� null����
	protected Engine engine; // protected�� �ڽĿ��� ��밡�� / private�ϸ� ���ϰ�ü�ȿ����� ��밡��, ��ü�ܺγ� �ڽİ�ü���� ����
	
	// Engine ��ü�� ���ڷ� ���޹޴� ������
	public Car(Engine engine) {
		this.engine=engine;  // �� engine �ʵ忡 ������ �Ű������� engine�� �����ϰڴ�
	}
	
	// �޼ҵ�
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine��ü�� ��� �޸� ���� �����");
			return;  // �޼ҵ� ������
		}
		System.out.println("�޷��� !!!");
	}
}
