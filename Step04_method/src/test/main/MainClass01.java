package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
	public static void main(String[] args) {
		// MyObject Ŭ������ ���ǵ� 3���� �޼ҵ带 ���ʷ� ȣ���ϴ� code�� �ۼ��� ������.
		MyObject obj=new MyObject();
		obj.walk();
		int num=obj.getNumber();
		String greet=obj.getGreeting();
		Car car=obj.getCar();
		
		// .setNum() .setName() .useCar() �޼ҵ� 3���� ȣ���ϴ� code�� �ۼ��� ������.
		obj.setNum(10);
		obj.setName("�豸��");
		obj.useCar(new Car());  // ���� �� ���� �����ؼ� �ֱ⵵ ����
		
		// .listenMusic() �޼ҵ带 ȣ���ϴ� code�� �ۼ��� ������.
		obj.listenMusic(new Radio(), new Speaker()); // ���������� �����Ҷ� �� Ŭ������ �����ͼ� ��
	}
}
 	