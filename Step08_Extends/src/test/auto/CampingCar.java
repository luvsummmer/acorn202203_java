package test.auto;

public class CampingCar extends Car {

	public CampingCar(Engine engine) {
		// super() => 부모클래스의 생성자를 호출하는 것 ! 최우선으로 해줘야 함
		// 자식생성자에서 받아서 부모생성자에게 참조값을 전달해줘야 함
		super(engine);
	}

	// 메소드
	public void sleepInCar() {
		System.out.println("차에서 잠을 자용 zzZ");
	}
}
