package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  ArrayList ��ü��
		 *  ģ�� �̸� 5���� ���
		 *  �ݺ��� ���鼭 ģ���̸��� ������ ���� �������� ����� ������.
		 *  0��° ģ�� : �豸��
		 *  1��° ģ�� : �ذ�
		 *  2��° ģ�� : ������
		 *  ...
		 */
		
		ArrayList<String> friends=new ArrayList<>();
		
		friends.add("����");
		friends.add("����");
		friends.add("����");
		friends.add("����");
		friends.add("�ξ�");
		
		for (int i=0; i<friends.size(); i++) { // length�� �ƴϰ� size !
			System.out.println(i+"��° ģ�� : "+friends.get(i)); // friends�� �ε����� ��������
		}
	}
}
