package test.mypac;
/*
 * [ interface ]
 * 
 * - �����ڰ� ����(�ܵ� ��ü ���� �Ұ�)
 * - ������ �޼ҵ�� ���� �� ����( �߻� �޼ҵ常 ���� �� �ִ� )
 * - �ʵ�� static final����� ���� �� �ִ�
 * - data type�� ������ �� �� �ִ�
 * - interface type�� �������� �ʿ��ϸ� ����(implements) Ŭ������ ���� ��ü�� �����ؾ� �Ѵ�(���Ŭ����X)
 * - Ŭ���� ����� ���� ���������, �������̽��� ���� ������ �����ϴ�
 */
public interface Remocon {
	
	// �ʵ�� static final field�� ���� �� �ִ� ! static final ���� ����
	public static final String COMPANY="LG";
	
	// �޼ҵ�� �߻�޼ҵ常 ������ �� �ִ� !
	public void up();
	public void down();
}
