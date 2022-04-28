package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	// 클래스 안 - 필드선언
	public static String myName="김구라";
	
	// 클래스 안 - 메소드 호출
	public static void test() {
		System.out.println("test() 호출됨");
	}
	
	// 클래스 안 - 'static' 메소드 !!
	public static void main(String[] args) {
		MyUtil.send();  // test.mypac.MyUtil.send(); => import할 필요 x
		MyUtil.version="1.0";
		System.out.println(MainClass02.myName);  // this로 못받음 => 그건 heap영역이니까 , MainClass02. 는 생략 가능
		MainClass02.test();  // MainClass02. 생략 가능
	}
}
