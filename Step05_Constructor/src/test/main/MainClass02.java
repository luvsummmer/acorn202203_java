package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Market;
import test.mypac.Memory;

public class MainClass02 {
	public static void main(String[] args) {
		
		// 1. MacBook ��ü�� �����ؼ� �������� mac1�̶�� ���������� ��ƺ�����.
		MacBook mac1=new MacBook(new Cpu(), new Memory(), new HardDisk());
		/*
		 * ���������Ϳ��� ������ �� ���� new�� �Ѵٴ� �� !!!
		 */
		
		// 2. mac1 ���������� ����ִ� �������� �̿��ؼ� .doGame()�̶�� �޼ҵ带 ȣ���� ������.
		mac1.doGame();
		
		// �ٸ� ���� �ִ� ���� �����ͼ� ����(�ٸ� Ŭ������ �ִ°� �����ؼ� ����)
		// Ŭ������ ���� �� �����Ϸ��� static �ڿ��̾�� �� !
		MacBook mac2=new MacBook(Market.c, Market.m, Market.h);
		mac2.doGame();
	}
}
