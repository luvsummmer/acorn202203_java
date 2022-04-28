package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Market;
import test.mypac.Memory;

public class MainClass02 {
	public static void main(String[] args) {
		
		// 1. MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아보세요.
		MacBook mac1=new MacBook(new Cpu(), new Memory(), new HardDisk());
		/*
		 * 참조데이터에서 참조를 할 때는 new를 한다는 것 !!!
		 */
		
		// 2. mac1 지역변수에 들어있는 참조값을 이용해서 .doGame()이라는 메소드를 호출해 보세요.
		mac1.doGame();
		
		// 다른 곳에 있는 값을 가져와서 쓰기(다른 클래스에 있는거 참조해서 쓰기)
		// 클래스에 점을 찍어서 참조하려면 static 자원이어야 함 !
		MacBook mac2=new MacBook(Market.c, Market.m, Market.h);
		mac2.doGame();
	}
}
