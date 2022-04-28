package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방 3개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums에 담기
		int[] nums= {0,0,0};  // 방법 1 : 직접 0을 넣어서 만들기 (뭐라도 집어넣어야지 만들어짐)
		nums[0]=10;
		nums[1]=20;
		nums[2]=30; // int배열이기때문에 30.1 이나 "kim"같은건 못들어감
		
		// 0으로 초기화된 방 3개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2=new int[3];  // 방법 2 : new int하고 값지정x, 배열안에 몇개인지 밝혀주기 (best)
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
		//nums2[3]=400;  => 없는 방번호를 참조하면 Exception 발생함
		
		System.out.println("마무리 작업을 하고 app을 종료합니다.");
	}
}
