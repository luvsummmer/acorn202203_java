package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// String type을 담을 수 있는 방 3개짜리 빈 배열객체를 만들어서 참조값을 지역변수 names에 담기
		String[] names=new String[3]; // {null, null, null}이랑 같음 !
		
		// 각각의 방에 순서대로 문자열 대입하기
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		// 반복문 돌면서
		for(int i=0; i<names.length; i++) {
			// i번째 String type 객체를 참조해서(불러와서)
			String tmp=names[i];  // String type인 이유는 String 배열이라서 !
			// 출력하기
			System.out.println(names[i]);  // i 돌면서 다 출력해줌
		}
	}
}
