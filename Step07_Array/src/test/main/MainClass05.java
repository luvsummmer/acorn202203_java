package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		// Ű����κ��� �Է¹��� �� �ִ� ��ü ����
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڿ� �Է�:");  // run���� �� �ȳ���
		
		// ���� �Է� �ް� (���ڿ���ȯ �޼ҵ� - nextLine)
		String str=scan.nextLine();
		// �Է¹��� ���ڿ��� �ֿܼ� ����ϰ�
		System.out.println(str);
		// ����
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");
	}
}
