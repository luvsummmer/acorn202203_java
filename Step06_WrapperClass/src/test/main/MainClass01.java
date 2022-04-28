package test.main;
/*
 * [ 기본 data type의 참조 data type ]
 * 
 * byte    : Byte
 * short   : Short
 * int     : Integer
 * long    : Long
 * 
 * float   : Float
 * double  : Double
 * 
 * char    : Character
 * boolean : Boolean
 * 
 * (int, char 빼고는 다 앞글자만 대문자로 바꾸면 됨) / 얘네는 기본패키지라서 import할 필요 x
 * 
 * - 때로는 기본데이터 type의 참조데이터 type이 필요할 때가 있음
 * - 기본데이터 type을 객체에 포장(boxing)하는 형태 ! => Wrapper Class라고 함
 * - boxing과 unboxing은 자등으로 되기 때문에 프로그래머가 신경쓸 필요 없음
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// 기본 데이터 type
		int num1=10;
		// 참조 데이터 type
		Integer num2=10;
		
		// 참조데이터 type이지만 기본데이터type처럼 사용할 수 있다
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;  // 연산해서 기본데이터로만들든 참조데이터로만들든 노상관
		
		// 숫자를 문자로 바꾸기  10 => "10"
		String strNum=num2.toString();  // 많이 쓰임***
		
		// 문자를 숫자로 바꾸기
		String strNum2="999";
		// Integer 클래스의 static 메소드 이용하면 됨(Integer에 점찍음)
		int result4=Integer.parseInt(strNum2);  // 많이 쓰임*** , 자스에선 Number였음
	}
}
