package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;


public class MainClass05 {
	public static void main(String[] args) {
		// 1. Car type�� ������ �� �ִ� ArrayList ��ü�� �����ؼ�
		// �������� List �������̽� type �������� Cars�� ��ƺ�����.
		List<Car> cars=new ArrayList<>();
		
		// 2. Car��ü (3��)�� �����ؼ� List��ü�� ��ƺ�����.
		Car car1=new Car("�غ���");
		Car car2=new Car("���");
		Car car3=new Car("����");  // ���������� �ȴ�� �ٷ� add�� new Car()�ص� ��
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		// 3. �ݺ��� for���� �̿��ؼ� List��ü�� ����� ��� Car ��ü�� drive() �޼ҵ带
		//������� ȣ���� ������.
		for(Car tmp:cars) {  // �տ� Generic ! <> ���´ٴ� �� !!
			tmp.drive(); // ������ �����ϸ鼭 �� ������ for���� �ֱ�
		}
	}
}
