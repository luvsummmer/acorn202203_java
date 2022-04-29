package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;


public class MainClass05 {
	public static void main(String[] args) {
		// 1. Car type을 저장할 수 있는 ArrayList 객체를 생성해서
		// 참조값을 List 인터페이스 type 지역변수 Cars에 담아보세요.
		List<Car> cars=new ArrayList<>();
		
		// 2. Car객체 (3개)를 생성해서 List객체에 담아보세요.
		Car car1=new Car("붕붕이");
		Car car2=new Car("방방");
		Car car3=new Car("빵빵");  // 지역변수에 안담고 바로 add에 new Car()해도 됨
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		// 3. 반복문 for문을 이용해서 List객체에 저장된 모든 Car 객체의 drive() 메소드를
		//순서대로 호출해 보세요.
		for(Car tmp:cars) {  // 앞에 Generic ! <> 적는다는 것 !!
			tmp.drive(); // 변수를 지정하면서 그 변수를 for문에 넣기
		}
	}
}
