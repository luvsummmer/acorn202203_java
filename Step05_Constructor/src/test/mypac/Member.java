package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	/*
	 * 기본 생성자도 필요하다면 정의할 수 있다.
	 * 생성자는 다중정의가 가능하다.
	 * 따라서 어떤 객체를 생성하는 방법(생성자)이 여러가지가 될 수도 있다 !!!*** ex) 커피만들때도 종류가 너무 다양, 객체도 용도에 따라 생성 가능
	 */
	public Member() {}
	
	// 필드에 저장할 값을 전달받는 생성자
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
		
		// 보통 생성자로 전달한 값은 필드에다가 저장하는 경우가 많음 (나중에 사용하려고)
	}
}
