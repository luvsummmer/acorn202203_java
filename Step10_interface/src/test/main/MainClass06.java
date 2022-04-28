package test.main;

import test.mypac.Drill;

public class MainClass06 {
	public static void main(String[] args) {
		
		
		
		// 익명의 local inner class로 Drill클래스 구현
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.err.println("바닥에다 구멍을 뚫어요 !");
			}
		});
		
		useDrill(()->{
			System.out.println("천장에 구멍을 뚫어여 !!");
		});
	}
	
	// 1개의 추상메소드로 구성되어 있는 Drill 객체를 인자로 전달받는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
}
