package test.main;

import test.mypac.Drill;

public class MainClass06 {
	public static void main(String[] args) {
		
		
		
		// �͸��� local inner class�� DrillŬ���� ����
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.err.println("�ٴڿ��� ������ �վ�� !");
			}
		});
		
		useDrill(()->{
			System.out.println("õ�忡 ������ �վ !!");
		});
	}
	
	// 1���� �߻�޼ҵ�� �����Ǿ� �ִ� Drill ��ü�� ���ڷ� ���޹޴� �޼ҵ�
	public static void useDrill(Drill d) {
		d.hole();
	}
}
