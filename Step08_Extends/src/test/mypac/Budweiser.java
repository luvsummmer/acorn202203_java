package test.mypac;

public class Budweiser extends Beer {
	// 생성자
	public Budweiser() {
		System.out.println("Budweiser 생성자 호출");
	}
	// 메소드
	public void budweiser() {
		System.out.println("맥주는 버드와이저 !");
	}
	@Override
	public void drink() {
		System.out.println("맥주도 머거요 근데 무적권 생맥이어야지 ^_^");
	}
}
