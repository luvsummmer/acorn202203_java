package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 기본 데이터 타입 double
		double num1=10.1;
		// 참조 데이터 타입 Double
		Double num2=10.2;
		
		// 참조 데이터 타입 Double이지만 마치 기본데이터 타입과 같이 사용할 수 있음
		double result1=num2+10;
		double result2=num1+num2;
		Double result3=num1+num2;
		
		// 숫자를 문자열로 바꾸기  10.1 => "10.1" / non-static method
		String strNum=num2.toString();
		
		// 문자열을 숫자(double)로 바꾸기  "10.3" => 10.3  / static method
		double result4=Double.parseDouble("10.3");
	}
}
