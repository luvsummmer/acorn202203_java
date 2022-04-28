package test.main;

import test.mypac.Remocon;
/*
 * �͸��� �̳�Ŭ���� (�Ʊ�� �̸� YourRemocon�̶�� �־����� ������ ����!)
 * 
 * ����Ŭ�������� Remocon �������̽��� �������� �������� ���� "new Remocon() {�߰�ȣ �ȿ� �ٷ� Ŭ���� �ۼ�}"
 * new ������ �ִ� �� �������̽��̴ϱ� implements �ڵ����� �� �� !
 * (new ������ �ִ� �� Ŭ�����̸� extends�� �ڵ����� �� ����)
 */
public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("�÷���");
			}
			
			@Override
			public void down() {
				System.out.println("������");
			}
		};
		
		// �̷��� �͸����̳�Ŭ���� ���� ���� r1�� ��Ҵٰ� �ᵵ �ǰ�
		useRemocon(r1);
		
		// ������ ���� �ʰ� �ٷ� �޼ҵ带 ������ �� �Ű������� new�� ���� ����鼭 �͸��� �̳�Ŭ���� �ۼ��ص� ��
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("�÷���");
			}
			
			@Override
			public void down() {
				System.out.println("������");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
