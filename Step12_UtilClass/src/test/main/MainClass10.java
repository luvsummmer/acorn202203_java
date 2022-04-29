package test.main;
/*
 *  무한루프 반복문
 */
public class MainClass10 {
	public static void main(String[] args) {
		int count=0;
		// 정확한 반복 횟수를 알 수 없을 때 사용할 수 있는 반복문
		while(true) {
			count++;
			System.out.println("반복 횟수:"+count);
		}
	}
}
