package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  ArrayList 객체에
		 *  친구 이름 5개를 담고
		 *  반복문 돌면서 친구이름을 다음과 같은 형식으로 출력해 보세요.
		 *  0번째 친구 : 김구라
		 *  1번째 친구 : 해골
		 *  2번째 친구 : 원숭이
		 *  ...
		 */
		
		ArrayList<String> friends=new ArrayList<>();
		
		friends.add("유민");
		friends.add("수진");
		friends.add("수정");
		friends.add("유리");
		friends.add("민아");
		
		for (int i=0; i<friends.size(); i++) { // length가 아니고 size !
			System.out.println(i+"번째 친구 : "+friends.get(i)); // friends의 인덱스값 가져오기
		}
	}
}
