package test.main;

import test.mypac.Joinner;
/*
 * 익명의 이너클래스 적는 방법 3
 * 
 * .equals 쓰는 법 - 문자열의 내용이 같은지 비교할 경우
 */
public class MainClass07 {
	public static void main(String[] args) {
		// 방식 1 (기본)
		Joinner j1=new Joinner() {
			@Override
			public String Join(String one, String two) {
				return one+two;
			}
		};
		
		// 방식 2 ()->{}; / 데이터타입 안써도 됨
		Joinner j2=(one, two)->{
			return one+two;
		};
		
		// 방식3(최종) (변수,변수)->리턴할 값; / 중괄호, 리턴 쓰지 않고 리턴할 값만 적음
		Joinner j3=(one, two)->one+two;
		
		String result1=j1.Join("kim", "gura");
		String result2=j2.Join("kim", "gura");
		String result3=j3.Join("kim", "gura");
		
		// 문자열은 내용이 같아도 참조값이 다를 수 있다(이말은 같을수도 있다는 것, 보장할 수 없음)
		boolean isEqual=result1==result2; // false, 문자열 내용은 같지만 참조값을 비교하는 거기 때문
		// 문자열의 내용 비교(내용이 같은지 비교)할 때는 String객체의 메소드를 활용해야 함 ! (.equals)
		boolean isEqual2=result1.equals(result2);
		boolean isEqual3=result1.equals("kimgura");
		boolean isEqual4="kimgura".equals(result1);
		
		// 이렇게 각 위치에 변수명을 넣든 문자를 바로 입력하든 상관없음
	}
}
