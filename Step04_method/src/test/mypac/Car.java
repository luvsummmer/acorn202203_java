package test.mypac;
/*
 * 클래스 설계하기
 * 
 * class의 역할
 * 
 * 1. 객체의 설계도 역할
 * 
 * 2. data type 역할
 * 
 * 3. static 필드와 메소드를 포함하는 역할
 * 
 */
public class Car {
	// 저장소(field)
	public String name; // 차의 이름을 저장할 수 있는 공간, 클래스 안에다가 선언(field) / 지역변수선언(method 안)이랑 비슷
	
	// 달리는 기능(method)
	public void drive() {
		System.out.println(this.name+" 이(가) 달려요 ! ! !");
	}
	// 멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요 ! !");
	}
}
