package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * Scanner��ü�� �̿��ؼ� ���ڿ��� 5�� �Է¹޴´�.
		 * �Է¹��� ���ڿ��� ���ʴ�� �迭�� ����Ǿ�� �Ѵ�.
		 * ��δ� �Է¹��� �� for���� �̿��ؼ� �迭�� ����� ��� ���ڿ���
		 * �ܼ�â�� ������� ����ϴ� �ڵ带 �ۼ��� ������.
		 */
		
		// Scanner ��ü 1�� �����
		Scanner scan=new Scanner(System.in);
		
		// String �迭 1�� / �迭 ���ڿ��̴ϱ� String !!
		String[] msgs=new String[5];
		
		// �Է¹��� ���ڿ� �迭�� ����
		for (int i=0; i<msgs.length; i++) {
			System.out.println("���ڿ� �Է�:");
			String msg=scan.nextLine();
			msgs[i]=msg;
		}
		
		// �ܼ�â�� ������� ���
		for (int i=0; i<msgs.length; i++) {
			String tmp=msgs[i];
			System.out.println(tmp);
		}

		
		// ������ �� , ���ڿ��迭�� �ƴ� ��ĳ�ʹ迭�� �������
//		Scanner[] scans=new Scanner[5];
//		
//		scans[0]=new Scanner(System.in);
//		scans[1]=new Scanner(System.in);
//		scans[2]=new Scanner(System.in);
//		scans[3]=new Scanner(System.in);
//		scans[4]=new Scanner(System.in);
//		
//		for (int i=0; i<scans.length; i++) {
//			String str=scans[i].nextLine();
//			System.out.println(str);
//		}
	}
}
