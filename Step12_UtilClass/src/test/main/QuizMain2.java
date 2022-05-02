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
 *  로또번호 발생기
 *  run을 누르면 로또번호 6개를 랜덤하게 출력하는 코드를 작성해 보세요.
 *  1~45 사이의 숫자 중에 6개가 나와야 하며
 *  중복되는 숫자가 있으면 안되고
 *  작은 숫자부터 큰 숫자까지 정렬까지 해서 출력해 보세요. 정렬 : 순서가 중요한 데이터 !
 *  
 *  ! 선생님 풀이 !
 *  
 */
public class QuizMain2 {
	public static void main(String[] args) {
		
		// 1. 랜덤숫자를 얻어내기 위해 랜덤객체 생성
		Random ran=new Random();
		
		// 3. 중복된 데이터가 저장되지 않는 정수를 저장할 수 있는 HashSet객체 생성 (순서x, 하나의 묶음)
		Set<Integer> st=new HashSet<>();
		
		// 2. 무한 루프 돌면서
		while (true) {
			// 랜덤한 숫자를 얻어내서
			int ranNum=ran.nextInt(45)+1;
			// 4. HashSet객체에 누적시키기
			st.add(ranNum);
			// 5. 번호가 6개가 되면
			if(st.size()==6) {
				break;  // 반복문 탈출
			}
		}
		
		// 6. 정렬하기 위해 순서가없는 HashSet의 데이터를 순서가 있는 ArrayList에 담기
		List<Integer> nums=new ArrayList<>(st);
		// 오름차순 정렬
		Collections.sort(nums);
		// 출력
		for (int tmp:nums) {
			System.out.print(tmp+",");
		}
		
		// 그냥 일케하면 안되나 ..?
		System.out.println(nums);

			
		
//		// 순서없는 아이템 주머니니까 HashSet 만들기(중복걸러줌)
//		Set<Integer> numbers=new HashSet<>();
//		
//		// HashSet 안에 랜덤번호 만들어서 주머니에 넣기
//		Random ran=new Random();
//		int ranNum=ran.nextInt(45)+1;
//		
//		for (int i=0; i<6; i++) {
//		numbers.add(ranNum);
//		
//		// 랜덤번호 일렬로 세워서 일단 꺼내기 - iterator
//		Iterator<Integer> LottoNum=numbers.iterator();
//
//		while(LottoNum.hasNext()) {
//			Integer item=LottoNum.next(); 
//			System.out.println(item);
//		}
//		// 6개 꺼내면 종료
		

	}
}
