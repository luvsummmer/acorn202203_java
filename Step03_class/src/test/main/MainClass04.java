package test.main;

import test.mypac.Member;  // ��Ű���� �ٸ��ϱ� import���ֱ�

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Member ��ü�� �����ؼ�
		Member m1=new Member();
		// 2. ȸ�� �Ѹ��� ������ ���
		m1.num=1;
		m1.name="����";
		m1.addr="����";
		// 3. showInfo() �޼ҵ带 ȣ���� ������.
		m1.showInfo();
	}
}
