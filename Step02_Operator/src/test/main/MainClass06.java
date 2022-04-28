package test.main;
/*
 * 6. 3항 연산자 테스트
 *    ?와 : 으로 구성되어 있음
 *    ? 좌측의 것이 true이면 => : 좌측이 남고 false이면 => : 우측이 남음
 *    if else문을 간략히 대체 가능
 */
public class MainClass06 {
	public static void main(String[] args) {
		
		boolean isWait=false;
		// isWait이 true이면 "기다려요"가 대입되고 false이면 "기다리지 않아요"가 대입됨
		String result = isWait ? "기다려요" : "기다리지 않아요";
		
		System.out.println(result);
		
		// 위의 3항 연산자는 아래와 같이 if ~ else 문과 같은 로직 !
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
