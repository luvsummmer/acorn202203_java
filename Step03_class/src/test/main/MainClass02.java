package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	// Ŭ���� �� - �ʵ弱��
	public static String myName="�豸��";
	
	// Ŭ���� �� - �޼ҵ� ȣ��
	public static void test() {
		System.out.println("test() ȣ���");
	}
	
	// Ŭ���� �� - 'static' �޼ҵ� !!
	public static void main(String[] args) {
		MyUtil.send();  // test.mypac.MyUtil.send(); => import�� �ʿ� x
		MyUtil.version="1.0";
		System.out.println(MainClass02.myName);  // this�� ������ => �װ� heap�����̴ϱ� , MainClass02. �� ���� ����
		MainClass02.test();  // MainClass02. ���� ����
	}
}
