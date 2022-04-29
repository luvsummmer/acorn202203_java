package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		// sample ������
		Map<String, String> dic=new HashMap<>();
		dic.put("house", "��");
		dic.put("phone", "��ȭ��");
		dic.put("car", "�ڵ���");
		dic.put("pencil", "����");
		dic.put("eraser", "���찳");
		
		/*
		 *  �˻��� �ܾ �Է��ϼ��� : house
		 *  house�� ���� ���Դϴ�.
		 *  
		 *  �˻��� �ܾ �Է��ϼ��� : gura
		 *  gura�� ��Ͽ� �����ϴ�.
		 */
		// Scanner ��ü�� �̿��ؼ� �ܾ� �Է¹ޱ�
		Scanner scan=new Scanner(System.in);
		System.out.println("�˻��� �ܾ �Է��ϼ��� : ");
		String word=scan.nextLine();
		
		// Map ��ü�� �ش� Ű������ ����� ���� �ִ��� �о�� ���� *�򰥸�
		String mean=dic.get(word);
		
		if(mean==null) {  // ã�� �ܾ ���� ���
			System.out.println(word+"�� ��Ͽ� �����ϴ�.");
		}else {  // ã�� �ܾ �ִ� ���
			System.out.println(word+"�� ���� "+mean+"�Դϴ�.");
		}
		
		/* ������ �� - "+dic.get(word)+"�Դϴ� �߰��� ���߿� ��������
		if (word==dic.get(word)) {
			System.out.println(word+"�� ���� "+dic.get(word)+"�Դϴ�);
		}else {
			System.out.println(word+"�� ��Ͽ� �����ϴ�.");
		}
		*/
	}
}
