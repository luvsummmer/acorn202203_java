package test.main;

import test.mypac.Remocon;
import test.mypac.TVRemocon;
import test.mypac.Volume;

public class MainClass02 {
	public static void main(String[] args) {
		// 직접 class를 만들어서 useRemocon()메소드를 여기서 호출해보세요.
		Remocon r1=new Volume();
		useRemocon(r1);
		
		Remocon r2=new TVRemocon();  // 쌤 꺼
		useRemocon(r2);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
