package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		// ������ ������ �� �ִ� ArrayList ��ü�� �����ؼ� (���� : Integer)
		// �������� *List �������̽� type*�� �������� nums�� ���
		List<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// Ȯ�� for���� �̿��ؼ� ������ ������ ������� �ܼ�â�� ����ϱ�
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	}
}
