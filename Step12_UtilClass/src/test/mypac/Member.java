package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	/*
	 * �⺻ �����ڵ� �ʿ��ϴٸ� ������ �� �ִ�.
	 * �����ڴ� �������ǰ� �����ϴ�.
	 * ���� � ��ü�� �����ϴ� ���(������)�� ���������� �� ���� �ִ� !!!*** ex) Ŀ�Ǹ��鶧�� ������ �ʹ� �پ�, ��ü�� �뵵�� ���� ���� ����
	 */
	public Member() {}
	
	// �ʵ忡 ������ ���� ���޹޴� ������
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
		
		// ���� �����ڷ� ������ ���� �ʵ忡�ٰ� �����ϴ� ��찡 ���� (���߿� ����Ϸ���)
	}
}
