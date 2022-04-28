package test.main;

import test.mypac.Remocon;
/*
 * �������̽��� �����ϴ� �̳�Ŭ���� (�̸����� : YourRemocon)
 * ���⼭ YourRemocon Ŭ���� => MainClass03�� �̳�Ŭ�����̰� Remocon Ŭ������ �����ϰ� �ִ�
 */
public class MainClass03 {
	
	static class YourRemocon implements Remocon {
		@Override
		public void up() {
			System.out.println("���𰡸� �÷���");
		}

		@Override
		public void down() {
			System.out.println("���𰡸� ������");
		}
		
	}
	
	// ���θ޼ҵ� - �̳�Ŭ���� YourRemocon�� ������ �����ϰ� r1�� ���, ������Ÿ���� Remocon !
	// �� ���� r1�� �Ʊ� ������ �޼ҵ� useRemocon�� �Ű����������� �ְ� ����
	public static void main(String[] args) {
		Remocon r1=new YourRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
