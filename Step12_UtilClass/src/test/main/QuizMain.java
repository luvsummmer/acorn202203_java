package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 *  로또번호 발생기
 *  run을 누르면 로또번호 6개를 랜덤하게 출력하는 코드를 작성해 보세요.
 *  1~45 사이의 숫자 중에 6개가 나와야 하며
 *  중복되는 숫자가 있으면 안되고
 *  작은 숫자부터 큰 숫자까지 정렬까지 해서 출력해 보세요.
 */
public class QuizMain {
	public static void main(String[] args) {

		
		for(int i=0; i<6; i++) {
			// HashSet이랑 ranNum 싹다 for문안이어야 해따 ㅜㅜ <= 이거 아니었음
			
			// 중복을 허용하지 않는 HashSet 만들기
			Set<Integer> numbers=new HashSet<>();
			
			Random ran=new Random();

			int ranNum=ran.nextInt(45)+1;
			numbers.add(ranNum);
		
			// HashSet 안의 로또번호 일렬로 세워주기 - iterator
			Iterator<Integer> LottoNum=numbers.iterator();
			
			// 로또번호 나열할 배열 만들고 중복을 제거한 HashSet 값 넣어주기
			List<Integer> list=new ArrayList<>(numbers);
			
			// 6보다 더 많이 돌 수도 있어서 for문사용 x
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
        // 방법 1. 중복을 허용하지 않는 HashSet 만들기
        Set<Integer> numbers = new HashSet<>(); // 3, 4, 5
        
        // 방법 2. list로 돌리기 =>if문으로 검사한번 해줘야함
        List<Integer> lottos = new ArrayList<>();
        Random ran = new Random();

        while (lottos.size() < 6) { // 리스트의 길이가 6보다 작을 때까지 실행
            int ranNum = ran.nextInt(45) + 1; // 1 ~ 45까지 난수 받아오기
            // numbers.add(ranNum);
            if (!lottos.contains(ranNum)) { // 리스트 안에 해당 난수가 없다면?
                lottos.add(ranNum); // 리스트에 난수를 저장하기
            }

            System.out.println(lottos); // 리스트 안의 변수 출력
        }

        
    }
}

정렬
        System.out.println("- ".repeat(15));

        Collections.sort(lottos);

        System.out.println(lottos);

		//내림차순
        System.out.println("- ".repeat(15));

        Collections.sort(lottos, Collections.reverseOrder());

        System.out.println(lottos);
*/