package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  Scanner ��ü�� �̿��� �ݺ����� ���鼭 ģ�� 3���� �̸��� �Է¹��� �� 
		 *  �Է¹��� �̸��� ArrayList ��ü�� ������� ������ �ϴ� ���α׷����� �غ�����.
		 *  
		 *  - hint
		 *  Scanner scan=new Scanner(System.in);
		 */
		
		// Ű����κ��� �Է¹��� ��ü
		Scanner scan=new Scanner(System.in);
		// �Է¹��� ���ڿ��� ������ ��ü
		ArrayList<String> names=new ArrayList<>();
		
		for (int i=0; i<3; i++) {
			System.out.println("ģ�� �̸� �Է� : ");
			String name=scan.nextLine();
			names.add(name);
		}
		
		// ����� ������ �ݺ��� ���鼭 ������� ����ϱ�
		for (int i=0; i<names.size(); i++) {
			// i��° item
			// .get() �޼ҵ尡 �������ִ� type�� String�� ���� => ArrayList<String>�̱� ����
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("------------");
		
		// Ȯ�� for�� (�ٷ� ���� for�� ���� ��) :�������ٰ� �迭 Ȥ�� ArrayList������, Generic �� ����
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
