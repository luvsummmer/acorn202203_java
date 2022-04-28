package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1. Bike객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서 참조값을 bikes라는 지역변수에 담아보세요.
		 * 2. 배열의 각각의 방(0,1,2번)에 Bike객체를 생성해서 담아보세요.
		 * 3. 반복문 for를 이용해서 순서대로 배열의 각각의 방에 있는 Bike객체의 ride()메소드를 호출해 보세요.
		 */
		
		//1.
		Bike[] bikes=new Bike[3];
		
		//2.
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();	
		
		/* 내가한 것
		 * 지역변수에 안넣고 배열 방에 바로 new Bike();라 적으면 
		 * 객체를 하나만 생성하게 되고 참조값도 하나만 있음, 반복문사용 못함
		 * Bike bike=new Bike();		
		 * bikes[0]=bike;
		 * bikes[1]=bike;
		 * bikes[2]=bike;
		 */
		
		//3.
		for (int i=0; i<bikes.length; i++) {
			Bike tmp=bikes[i];
			tmp.ride();  // 나 변수만들어놓고 bike. 이캄 ㅋㅋ 확인잘하기 !
	}
	}
}
