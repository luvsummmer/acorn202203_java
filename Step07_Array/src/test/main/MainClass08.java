package test.main;

import java.util.Random;

/*
 *    
 * 2. 5���� ���ڿ� �߿��� 3���� ���ٿ� �ѹ��� �����ϰ� ��µǰ� �� ������.
 *    ex)  cherry | apple | cherry
 *         7 | apple | melon
 *         7 | 7 | 7
 *
 *    3�� ��� ���� �������� ���� �� ���� �ű��
 */
public class MainClass08 {
	public static void main(String[] args) {
		
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		// �ο��� ������ �̸� �迭�� �غ�
		int[] points= {10, 20, 30, 40, 1000};
		
		Random ran=new Random();  // ������ ���� ���
		
		// 0~4 ������ ���� �߿��� ������ ���� 3�� ����
		int num1=ran.nextInt(5);
		int num2=ran.nextInt(5);
		int num3=ran.nextInt(5);
		
		// ����� ���ڿ��� �����ϱ�
		String line=items[num1]+" | "+items[num2]+" | "+items[num3];
		
		int jumsu=0;  // �ʱⰪ 0, �������ٸ� �����ο�
		
		// ���� ������ �������� ��� ���ٸ� (�ڹ� : ������� �ѹ��� ������ ����)
		if (num1==num2 && num2==num3) {
			// ������ �����Ѵ�
			jumsu=points[num1];
		}
		
		// ����ϱ�
		System.out.println(line);
		
		System.out.println("���� : "+jumsu);

		// ���� ��µ� ���� : ���� ���ڿ��� 3�� ������ ���� �̷���
		
	}
}
