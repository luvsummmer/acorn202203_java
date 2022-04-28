package test.mypac;

public class Member {
	
	// 저장소(field), 설계도에 불과 ( 여기서는 static 안씀 ! static은 객체랑 상관없음 )
	public int num;  // public : 공용, 어디서든지 이 필드를 접근가능하도록(import) 하겠다
	public String name;
	public String addr;
	
	// 기능(method)
	public void showInfo() {
		// 필드에 저장된 내용을 아래와 같은 형식으로 콘솔창에 출력하는 코드를 작성해 보세요.
		// 번호:1, 이름:김구라, 주소:노량진
		// 얘는 이 객체 자체에서 생성된 거니까 생성된 그 객체를 가리키는 this 사용 가능		
		System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소:"+this.addr);
	}
	

}
