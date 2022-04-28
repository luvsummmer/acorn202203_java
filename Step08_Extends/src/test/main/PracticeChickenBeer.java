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
		
		// 다형성 확인하기 - 참조값은 같지만 설명서가 다른 경우
		Budweiser b1=new Budweiser();
		Beer b2=b1;
		EatChicken b3=b1;
		
		// casting하기
		EatChicken c=new Budweiser();
		c.chicken();  // 치맥벋와 할 수 있는 Budweiser지만 치킨밖에 못먹는 EatChicken 설명서
		
		// 설명서를 치맥으로 바꾸고 싶다면? EatChicken설명서 c를 Beer로 바꿔줌
		Beer cb=(Beer)c;
		cb.chicken();
		cb.drink();
		
		// 설명서를 치맥벋와로 바꾸고 싶다면? 설명서 벋와로 바꿔줌
		Budweiser cbb=(Budweiser)c;
		cbb.chicken();
		cbb.drink();
		cbb.budweiser();
		
		// override하기 - 부모객체 기능이 구릴 때 자식객체에서 다시 재정의
		// => Budweiser 클래스에서 맥주를 생맥으로 바꿨음, 
		// 이제 여기 안에서 Budweiser 객체를 만든건 모두 생맥으로 나옴 !
		
		// Exception(에러)인 경우
		EatChicken chicken=new EatChicken(); // 첨부터 기능도 치킨하나밖에 못먹는 설명서
		//Beer chicBeer=(Beer)chicken; <-여기서부터 에러뜸, 첨부터 치킨밖에 못먹는거 맥주먹게 못함
		//Budweiser chicBeerBud=(Budweiser)chicken; <- 당연히 안됨
		
		// chicBeer.chicken();
		// chicBeer.drink();
		// chicBeerBud.budweiser(); <- 당연히 얘네들도 안됨
		
		
	}
}
