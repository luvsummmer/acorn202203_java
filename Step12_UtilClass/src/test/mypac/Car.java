package test.mypac;

public class Car {
	// 필드
	private String name;
	
	// 생성자 (인자로 자동차이름 전달)
	public Car(String name) {
		this.name=name;
	}
	
	// 메소드
	public void drive() {
		System.out.println(this.name+" 이(가) 부릉부릉 달려용 !!");
	}
}
