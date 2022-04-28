package test.main;

import test.mypac.Remocon;
import test.mypac.TVRemocon;
import test.mypac.Volume;

public class MainClass02 {
	public static void main(String[] args) {
		// ���� class�� ���� useRemocon()�޼ҵ带 ���⼭ ȣ���غ�����.
		Remocon r1=new Volume();
		useRemocon(r1);
		
		Remocon r2=new TVRemocon();  // �� ��
		useRemocon(r2);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
