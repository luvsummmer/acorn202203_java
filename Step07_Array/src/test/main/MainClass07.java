package test.main;

import java.util.Random;

/*
 * 1. cherry, apple, banana, melon, 7
 *    5���� ���ڿ� �߿��� 1���� �����ϰ� ��µǰ� �� ������.
 *    
 * 2. 5���� ���ڿ� �߿��� 3���� ���ٿ� �ѹ��� �����ϰ� ��µǰ� �� ������.
 *    ex)  cherry | apple | cherry
 *         7 | apple | melon
 *         7 | 7 | 7
 *         
 *    - hint
 *    String[] items={"cherry", "apple", "banana", "melon", "7"};
 *    
 *    Random ran=new Random();
 *    int ranNum=ran.nextInt(5);
 */
public class MainClass07 {
	public static void main(String[] args) {
		
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		
		Random ran=new Random();  // ������ ���� ���
		
		// 1.
		int ranNum=ran.nextInt(5);  // ���ȣ ���
		System.out.println(items[ranNum]);
		
		// 2.
		// 0~4 ������ ���� �߿��� ������ ���� 3�� ����
		int num1=ran.nextInt(5);
		int num2=ran.nextInt(5);
		int num3=ran.nextInt(5);
		
		// ����� ���ڿ��� �����ϱ�
		String line=items[num1]+" | "+items[num2]+" | "+items[num3];
		
		// ����ϱ�
		System.out.println(line);

		// ���� ��µ� ���� : ���� ���ڿ��� 3�� ������ ���� �̷���
		
	}
}
