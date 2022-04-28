package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * Scanner객체를 이용해서 문자열을 5번 입력받는다.
		 * 입력받은 문자열은 차례대로 배열에 저장되어야 한다.
		 * 모두다 입력받은 후 for문을 이용해서 배열에 저장된 모든 문자열을
		 * 콘솔창에 순서대로 출력하는 코드를 작성해 보세요.
		 */
		
		// Scanner 객체 1개 만들기
		Scanner scan=new Scanner(System.in);
		
		// String 배열 1개 / 배열 문자열이니까 String !!
		String[] msgs=new String[5];
		
		// 입력받은 문자열 배열에 저장
		for (int i=0; i<msgs.length; i++) {
			System.out.println("문자열 입력:");
			String msg=scan.nextLine();
			msgs[i]=msg;
		}
		
		// 콘솔창에 순서대로 출력
		for (int i=0; i<msgs.length; i++) {
			String tmp=msgs[i];
			System.out.println(tmp);
		}

		
		// 내가한 것 , 문자열배열이 아닌 스캐너배열을 만들었음
//		Scanner[] scans=new Scanner[5];
//		
//		scans[0]=new Scanner(System.in);
//		scans[1]=new Scanner(System.in);
//		scans[2]=new Scanner(System.in);
//		scans[3]=new Scanner(System.in);
//		scans[4]=new Scanner(System.in);
//		
//		for (int i=0; i<scans.length; i++) {
//			String str=scans[i].nextLine();
//			System.out.println(str);
//		}
	}
}
