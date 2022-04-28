package test.mypac;

public class Market {
	// static 필드에서 지역변수 선언과 동시에 값 집어넣기
	// 클래스에 점을 찍어서 참조하려면 static 자원이어야 함 !
	public static Cpu c=new Cpu();
	public static Memory m=new Memory();
	public static HardDisk h=new HardDisk();
}
