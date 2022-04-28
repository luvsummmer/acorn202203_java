package test.mypac;

public class Rect {
	// 필드
	public int width;
	public int height;
	
	// 메소드 1 - 면적을 콘솔에 출력
	public void showArea() {
		//면적 얻어내기
		int area=width*height;
		//콘솔에 출력하기
		System.out.println("면적:"+area);
		// 이제 폭과 높이를 다르게 넣어서 new 할 때마다 계속 만들어낼 수 있음 !
	}
	
	// 메소드 2 - 면적을 메소드를 호출한 곳으로 리턴해줌(데이터타입은 int) - 잘몰게따 !!
	public int getArea() {
		int area=width*height;
		return area;
	}
}	


	//내가 한 것 - 이거도 맞음
	//public void showArea() {
	//	System.out.println("사각형의 넓이는 "+width*height);
	//}

