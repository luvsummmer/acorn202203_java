package test.mypac;
/*/
 * 내부 클래스 !
 */

// 동물원 클래스
public class Zoo {
	/*
	 * 클래스 안에 정의할 수 있는 것들
	 * 생성자, 필드, 메소드, '클래스'
	 */
	
	// 내부 클래스(inner class) : 클래스 안의 클래스
	public class Monkey{
		public void say() {
			System.out.println("안녕 나는 원숭이야 ><");
		}
	}
	// 내부 클래스
	public class Tiger{
		public void say() {
			System.out.println("안녕 나는 호랑이야 ^_^");
		}
	}
	
	// 메소드 - 내부 클래스로 객체를 생성해서 리턴해줌
	// getMonkey()를 호출하면 Monkey()객체를 만들어서 리턴
	public Monkey getMonkey() {
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}
