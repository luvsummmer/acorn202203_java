package test.auto;

/*
 * Car 클래스 상속받아서 원하는 차 만들기
 */
public class RacingCar extends Car {

	// 부모클래스 생성자 호출
	public RacingCar(Engine engine) {
		super(engine);
	}


	@Override //(했지만 부모메소드가 필요하다면 super 가능)
	public void drive() {
		
		/*
		 * 재정의(오버라이드)한 부모메소드를 호출해야 할지 말지는 상황에 따라 다름
		 * 부모의 메소드를 호출해 주지 않으면 객체가 제대로 동작하지 않는 경우도 있음
		 * => 그럴 경우에 부모의 메소드를 반드시 호출해주어야 함
		 */
		super.drive(); // 부모쪽 메소드, super는 부모일수도 부모의 객체일수도 있음
		System.out.println("조금 더 가속을 붙여서 엄청 빠르게 달려요");
		
	}
		
		
	
}
