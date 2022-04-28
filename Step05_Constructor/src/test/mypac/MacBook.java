package test.mypac;

public class MacBook {
	
	// 비공개 필드, 외부에서 접근 불가하도록 접근 지정자를 private로 해서 필드 3개 선언하기
	private Cpu cpu; // 참조데이터타입 : 선언만 하면 null 상태
	private Memory memory;
	private HardDisk hardDisk;
	
	// 생성자 - 필드에 필요한 값 넣기
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	
	// 메소드 - 부품이 null일 때 동작하지 않는 경우 만들어 보기
	public void doGame() {
		if(cpu==null || memory==null || hardDisk==null) {
			System.out.println("부품이 부족해서 맥북이 동작을 할 수 없습니다.");
			return; // 메소드를 여기서 끝내기
		}
		System.out.println("신나게 게임을 해요 !");
	}
}
