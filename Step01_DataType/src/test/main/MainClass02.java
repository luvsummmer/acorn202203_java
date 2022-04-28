package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 소수점까지 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.
		double avg=(kor+eng)/2d;
		
		System.out.println("평균:"+avg);
		// 자바에서 정수끼리 연산하면 결과도 정수로만 나옴 ! 소수점 잘릴 수 있음
		// 숫자 둘중에 하나를 실수로 만들어주기 -> 2d 혹은 2.0 혹은 2f => 결과도 실수 !
	}
}
