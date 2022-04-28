package test.mypac;
/*
 * 인터페이스 다중구현가능 => implements 뒤에 구현할 인터페이스들 나열하기
 * 이렇게 구현했을 경우 사용 가능한 데이터타입이 더 많아짐 (다형성) : Object, MultiObject, Remocon, Drill
 * 여러개 구현했을 시 순서대로 쭉 override해주면 됨
 */
public class MultiObject implements Remocon, Drill{

	@Override
	public void up() {
		System.out.println("올려요");
	}

	@Override
	public void down() {
		System.out.println("내려요");
	}

	@Override
	public void hole() {
		System.out.println("구멍팡팡");
	}
	
}
