package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 *  �ζǹ�ȣ �߻���
 *  run�� ������ �ζǹ�ȣ 6���� �����ϰ� ����ϴ� �ڵ带 �ۼ��� ������.
 *  1~45 ������ ���� �߿� 6���� ���;� �ϸ�
 *  �ߺ��Ǵ� ���ڰ� ������ �ȵǰ�
 *  ���� ���ں��� ū ���ڱ��� ���ı��� �ؼ� ����� ������.
 */
public class QuizMain {
	public static void main(String[] args) {

		
		for(int i=0; i<6; i++) {
			// HashSet�̶� ranNum �ϴ� for�����̾�� �ص� �̤� <= �̰� �ƴϾ���
			
			// �ߺ��� ������� �ʴ� HashSet �����
			Set<Integer> numbers=new HashSet<>();
			
			Random ran=new Random();

			int ranNum=ran.nextInt(45)+1;
			numbers.add(ranNum);
		
			// HashSet ���� �ζǹ�ȣ �Ϸķ� �����ֱ� - iterator
			Iterator<Integer> LottoNum=numbers.iterator();
			
			// �ζǹ�ȣ ������ �迭 ����� �ߺ��� ������ HashSet �� �־��ֱ�
			List<Integer> list=new ArrayList<>(numbers);
			
			// 6���� �� ���� �� ���� �־ for����� x
			while(LottoNum.hasNext()) {
				Integer fLottoNum=LottoNum.next();
				System.out.println(fLottoNum);
			}
		}
	}
}


/*
package com.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // ��� 1. �ߺ��� ������� �ʴ� HashSet �����
        Set<Integer> numbers = new HashSet<>(); // 3, 4, 5
        
        // ��� 2. list�� ������ =>if������ �˻��ѹ� �������
        List<Integer> lottos = new ArrayList<>();
        Random ran = new Random();

        while (lottos.size() < 6) { // ����Ʈ�� ���̰� 6���� ���� ������ ����
            int ranNum = ran.nextInt(45) + 1; // 1 ~ 45���� ���� �޾ƿ���
            // numbers.add(ranNum);
            if (!lottos.contains(ranNum)) { // ����Ʈ �ȿ� �ش� ������ ���ٸ�?
                lottos.add(ranNum); // ����Ʈ�� ������ �����ϱ�
            }

            System.out.println(lottos); // ����Ʈ ���� ���� ���
        }

        
    }
}

����
        System.out.println("- ".repeat(15));

        Collections.sort(lottos);

        System.out.println(lottos);

		//��������
        System.out.println("- ".repeat(15));

        Collections.sort(lottos, Collections.reverseOrder());

        System.out.println(lottos);
*/