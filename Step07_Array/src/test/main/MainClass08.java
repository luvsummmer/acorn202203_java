package test.main;

import java.util.Random;

/*
 *    
 * 2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
 *    ex)  cherry | apple | cherry
 *         7 | apple | melon
 *         7 | 7 | 7
 *
 *    3개 모두 같은 아이템이 나올 때 점수 매기기
 */
public class MainClass08 {
	public static void main(String[] args) {
		
		String[] items= {"cherry", "apple", "banana", "melon", "7"};
		// 부여할 점수도 미리 배열에 준비
		int[] points= {10, 20, 30, 40, 1000};
		
		Random ran=new Random();  // 랜덤한 정수 얻기
		
		// 0~4 사이의 정수 중에서 랜덤한 정수 3개 얻어내기
		int num1=ran.nextInt(5);
		int num2=ran.nextInt(5);
		int num3=ran.nextInt(5);
		
		// 출력할 문자열을 구성하기
		String line=items[num1]+" | "+items[num2]+" | "+items[num3];
		
		int jumsu=0;  // 초기값 0, 점수같다면 점수부여
		
		// 만일 세개의 아이템이 모두 같다면 (자바 : 동등연산자 한번에 세개비교 못함)
		if (num1==num2 && num2==num3) {
			// 점수를 대입한다
			jumsu=points[num1];
		}
		
		// 출력하기
		System.out.println(line);
		
		System.out.println("점수 : "+jumsu);

		// 점수 출력도 가능 : 같은 문자열이 3개 나오면 몇점 이런식
		
	}
}
