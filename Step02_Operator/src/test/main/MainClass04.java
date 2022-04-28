package test.main;
/*
 * 4. 논리연산자 테스트
 */
public class MainClass04 {
	public static void main(String[] args) {
		// or 연산
		/*
		 * '또는' 이라고 읽음
		 * 어느 하나만 true이면 결과는 true
		 * 모두 다 false일때만 결과가 false
		 */
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		
		// and 연산
		/*
		 * '그리고' 라고 읽음
		 * 모두 다 true일때만 결과가 true
		 * 어느 하나만 false이면 결과는 false
		 */
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		
		// not 연산
		/*
		 * '~가 아니면' 이라고 읽음
		 * boolean값을 반전시킴 (true이면 false, false이면 true)
		 */
		boolean result9 = !true; //false
		boolean result10 = !false; //true
	}
}
