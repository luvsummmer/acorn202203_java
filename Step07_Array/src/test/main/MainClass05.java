package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 키보드로부터 입력받을 수 있는 객체 생성
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");  // run했을 때 안내용
		
		// 한줄 입력 받고 (문자열변환 메소드 - nextLine)
		String str=scan.nextLine();
		// 입력받은 문자열을 콘솔에 출력하고
		System.out.println(str);
		// 종료
		System.out.println("main 메소드가 종료됩니다.");
	}
}
