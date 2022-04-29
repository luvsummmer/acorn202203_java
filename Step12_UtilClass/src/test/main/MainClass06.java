package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. member ��ü�� ���� �� �ִ� ArrayList ��ü�� �����ؼ�
		// �������� members��� ���������� ��ƺ�����.
		List<Member> members=new ArrayList<>(); // Generic ���� ���ϸ� Object type���� ��, �׷� ĳ�����ؿ;� ��
		
		// 2. 3���� ȸ�������� Member��ü�� ���� ��ƺ�����. (Member��ü�� 3�� �����Ǿ�� ��)
		
		Member m1=new Member(1, "�豸��", "�뷮��");
		Member m2=new Member(2, "�ذ�", "��ŵ�");
		Member m3=new Member(3, "������", "�����");

		
		//�ʵ带 ���� �����ؼ� ���� ���� ���� - ���������� public�̾ �ƿ� �ٸ� ��Ű���� �ִ� �ʵ带 ��������
		// m1.num="3";
		// m1.name="������";
		// m1.addr="�󵵵�";
		// members.add(m1);
		
		// 3. ������ ������ Member��ü�� �������� members List��ü�� ��� ��ƺ�����.
		
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		/*
		 *  4. members List ��ü�� ��� ������ �̿��ؼ� ȸ�� ����� �Ʒ��� ���� ��������
		 *  �ݺ����� ���鼭 ����غ�����.
		 *  
		 *  ��ȣ: 1, �̸�: �豸��, �ּ�: �뷮��
		 *  ��ȣ: 2, �̸�: �ذ�, �ּ�: ��ŵ�
		 */
		for(Member tmp:members) {
			System.out.println("��ȣ: "+tmp.num+", �̸�: "+tmp.name+", �ּ�: "+tmp.addr);
		}
	}
}
