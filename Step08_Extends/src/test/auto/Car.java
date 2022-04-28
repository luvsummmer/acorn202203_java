package test.auto;
/*
 *  - 접근 지정자 접근범위
 * 
 * public : 어디에서나 접근 가능
 * protected : 동일한 package 혹은 상속관계에서 자식에서 접근 가능
 * default : 동일한 package 안에서만 접근 가능
 * private : 동일한 클래스 혹은 동일한 객체 안에서만 접근 가능
 * 
 *  - 접근 지정자를 붙이는 위치
 * 1. 클래스를 선언할 때
 * 2. 생성자 (new를 할 수 있는 위치)
 * 3. 필드
 * 4. 메소드
 * 
 * 클래스는 default와 public, 두가지 접근 지정자만 지정 가능 (import 가능 여부)
 * 접근 지정자 생략한 것 : default 접근지정자
 */
public class Car {
	// 필드 - 선언만 했으니까 null상태
	protected Engine engine; // protected는 자식에서 사용가능 / private하면 동일객체안에서만 사용가능, 객체외부나 자식객체에서 못씀
	
	// Engine 객체를 인자로 전달받는 생성자
	public Car(Engine engine) {
		this.engine=engine;  // 이 engine 필드에 생성자 매개변수인 engine을 대입하겠다
	}
	
	// 메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine객체가 없어서 달릴 수가 없어요");
			return;  // 메소드 끝내기
		}
		System.out.println("달려용 !!!");
	}
}
