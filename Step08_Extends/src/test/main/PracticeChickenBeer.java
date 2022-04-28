package test.main;

import test.mypac.Beer;
import test.mypac.Budweiser;
import test.mypac.EatChicken;

public class PracticeChickenBeer {
	public static void main(String[] args) {
		Beer b=new Beer();
		b.chicken();
		b.drink();
		
		Budweiser bb=new Budweiser();
		bb.chicken();
		bb.drink();
		bb.budweiser();
		
		// ������ Ȯ���ϱ� - �������� ������ ������ �ٸ� ���
		Budweiser b1=new Budweiser();
		Beer b2=b1;
		EatChicken b3=b1;
		
		// casting�ϱ�
		EatChicken c=new Budweiser();
		c.chicken();  // ġ�ƹ��� �� �� �ִ� Budweiser���� ġŲ�ۿ� ���Դ� EatChicken ����
		
		// ������ ġ������ �ٲٰ� �ʹٸ�? EatChicken���� c�� Beer�� �ٲ���
		Beer cb=(Beer)c;
		cb.chicken();
		cb.drink();
		
		// ������ ġ�ƹ��ͷ� �ٲٰ� �ʹٸ�? ���� ���ͷ� �ٲ���
		Budweiser cbb=(Budweiser)c;
		cbb.chicken();
		cbb.drink();
		cbb.budweiser();
		
		// override�ϱ� - �θ�ü ����� ���� �� �ڽİ�ü���� �ٽ� ������
		// => Budweiser Ŭ�������� ���ָ� �������� �ٲ���, 
		// ���� ���� �ȿ��� Budweiser ��ü�� ����� ��� �������� ���� !
		
		// Exception(����)�� ���
		EatChicken chicken=new EatChicken(); // ÷���� ��ɵ� ġŲ�ϳ��ۿ� ���Դ� ����
		//Beer chicBeer=(Beer)chicken; <-���⼭���� ������, ÷���� ġŲ�ۿ� ���Դ°� ���ָ԰� ����
		//Budweiser chicBeerBud=(Budweiser)chicken; <- �翬�� �ȵ�
		
		// chicBeer.chicken();
		// chicBeer.drink();
		// chicBeerBud.budweiser(); <- �翬�� ��׵鵵 �ȵ�
		
		
	}
}
