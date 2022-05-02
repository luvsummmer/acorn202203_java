package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/*
 *  �ζǹ�ȣ �߻���
 *  run�� ������ �ζǹ�ȣ 6���� �����ϰ� ����ϴ� �ڵ带 �ۼ��� ������.
 *  1~45 ������ ���� �߿� 6���� ���;� �ϸ�
 *  �ߺ��Ǵ� ���ڰ� ������ �ȵǰ�
 *  ���� ���ں��� ū ���ڱ��� ���ı��� �ؼ� ����� ������. ���� : ������ �߿��� ������ !
 *  
 *  ! ������ Ǯ�� !
 *  
 */
public class QuizMain2 {
	public static void main(String[] args) {
		
		// 1. �������ڸ� ���� ���� ������ü ����
		Random ran=new Random();
		
		// 3. �ߺ��� �����Ͱ� ������� �ʴ� ������ ������ �� �ִ� HashSet��ü ���� (����x, �ϳ��� ����)
		Set<Integer> st=new HashSet<>();
		
		// 2. ���� ���� ���鼭
		while (true) {
			// ������ ���ڸ� ����
			int ranNum=ran.nextInt(45)+1;
			// 4. HashSet��ü�� ������Ű��
			st.add(ranNum);
			// 5. ��ȣ�� 6���� �Ǹ�
			if(st.size()==6) {
				break;  // �ݺ��� Ż��
			}
		}
		
		// 6. �����ϱ� ���� ���������� HashSet�� �����͸� ������ �ִ� ArrayList�� ���
		List<Integer> nums=new ArrayList<>(st);
		// �������� ����
		Collections.sort(nums);
		// ���
		for (int tmp:nums) {
			System.out.print(tmp+",");
		}
		
		// �׳� �����ϸ� �ȵǳ� ..?
		System.out.println(nums);

			
		
//		// �������� ������ �ָӴϴϱ� HashSet �����(�ߺ��ɷ���)
//		Set<Integer> numbers=new HashSet<>();
//		
//		// HashSet �ȿ� ������ȣ ���� �ָӴϿ� �ֱ�
//		Random ran=new Random();
//		int ranNum=ran.nextInt(45)+1;
//		
//		for (int i=0; i<6; i++) {
//		numbers.add(ranNum);
//		
//		// ������ȣ �Ϸķ� ������ �ϴ� ������ - iterator
//		Iterator<Integer> LottoNum=numbers.iterator();
//
//		while(LottoNum.hasNext()) {
//			Integer item=LottoNum.next(); 
//			System.out.println(item);
//		}
//		// 6�� ������ ����
		

	}
}
