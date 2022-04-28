package test.main;
/*
 * java에서는 배열도 객체임
 * => 즉 배열은 참조데이터 타입 !!
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열 ( 데이터타입 : int[] )
		int[] nums={10, 20, 30, 40, 50};
		
		// double type 5개를 저장하고 있는 배열
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		
		// boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true, false, false, true, true};
		
		// String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
		// 위에 애들 다 id값 생김 ! 객체라는 뜻, 참조데이터 타입 !!

		// 배열 각각의 방 참조하기
		int result1=nums[0];  // 10
		double result2=nums2[1];  // 10.2
		boolean result3=truth[2];  // false
		String result4=names[3];  // "주뎅이"
		
		// 배열 객체의 메소드와 필드 사용해보기
		int[] cloned=nums.clone();  // 많이 안씀
		int size=nums.length;  // 자주 사용
	}
}
