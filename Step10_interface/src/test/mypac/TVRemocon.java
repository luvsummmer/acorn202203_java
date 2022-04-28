package test.mypac;
/*
 * 쌤 꺼
 */
public class TVRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("TV채널을 올려요");
	}

	@Override
	public void down() {
		System.out.println("TV채널을 내려요");
	}
	
}
