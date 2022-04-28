package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  2. 논리형 (boolean)
 *  
 *  - true, false 두가지 값중 하나이다.
 *  - true, false 를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼수 있다. 
 *  - 참과 거짓을 나타내는 데이터 type 
 */
public class MainClass03 {
	// run 했을 때 실행의 흐름이 시작되는 ! 특별한 main method(기본 메소드)
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요");
		}
		
		//비교연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리연산의 결과로 얻어진 boolean 값 담기
		boolean result=true||false;
		
		//한번 선언한 변수는 다시 선언할 수 없다 ! !
		//boolean result=false; (중복선언 안됨)
		result=false;  // 변수에 다른 값을 대입할 수 있다 (동일한 type인 경우)
		// 다른 type의 값은 변수에 담을 수 없다.
		//result=10;
		
		// javascript : 동적타입(dynamic type), 타입이 그때그때 바뀐다
		// java : 정적타입, 문법이 엄격하면 대체로 코딩양이 늘어남, 대신 잘못된 동작을 할 가능성 줄어듦
	}
}
