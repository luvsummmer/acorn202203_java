package test.main;

import test.auto.CampingCar;
import test.auto.Engine;

public class MainClass07 {
	public static void main(String[] args) {
		
		//Car car=new Car(new Engine()); // 그냥 Car생성 안되고 Engine도 생성해야 함
		
		CampingCar car1=new CampingCar(new Engine());
		car1.drive();
		car1.sleepInCar();
		
	}
}
