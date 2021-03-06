package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해 반복문을 돌면서 친구 3명의 이름을 입력받은 후 
		 *  입력받은 이름을 ArrayList 객체에 순서대로 저장을 하는 프로그래밍을 해보세요.
		 *  
		 *  - hint
		 *  Scanner scan=new Scanner(System.in);
		 */
		
		// 키보드로부터 입력받을 객체
		Scanner scan=new Scanner(System.in);
		// 입력받은 문자열을 저장할 객체
		ArrayList<String> names=new ArrayList<>();
		
		for (int i=0; i<3; i++) {
			System.out.println("친구 이름 입력 : ");
			String name=scan.nextLine();
			names.add(name);
		}
		
		// 저장된 내용을 반복문 돌면서 순서대로 출력하기
		for (int i=0; i<names.size(); i++) {
			// i번째 item
			// .get() 메소드가 리턴해주는 type이 String인 이유 => ArrayList<String>이기 때문
			String tmp=names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("------------");
		
		// 확장 for문 (바로 위의 for문 줄인 것) :우측에다가 배열 혹은 ArrayList참조값, Generic 잘 쓰기
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
