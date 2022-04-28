package test.main;

import test.mypac.Joinner;
/*
 * �͸��� �̳�Ŭ���� ���� ��� 3
 * 
 * .equals ���� �� - ���ڿ��� ������ ������ ���� ���
 */
public class MainClass07 {
	public static void main(String[] args) {
		// ��� 1 (�⺻)
		Joinner j1=new Joinner() {
			@Override
			public String Join(String one, String two) {
				return one+two;
			}
		};
		
		// ��� 2 ()->{}; / ������Ÿ�� �Ƚᵵ ��
		Joinner j2=(one, two)->{
			return one+two;
		};
		
		// ���3(����) (����,����)->������ ��; / �߰�ȣ, ���� ���� �ʰ� ������ ���� ����
		Joinner j3=(one, two)->one+two;
		
		String result1=j1.Join("kim", "gura");
		String result2=j2.Join("kim", "gura");
		String result3=j3.Join("kim", "gura");
		
		// ���ڿ��� ������ ���Ƶ� �������� �ٸ� �� �ִ�(�̸��� �������� �ִٴ� ��, ������ �� ����)
		boolean isEqual=result1==result2; // false, ���ڿ� ������ ������ �������� ���ϴ� �ű� ����
		// ���ڿ��� ���� ��(������ ������ ��)�� ���� String��ü�� �޼ҵ带 Ȱ���ؾ� �� ! (.equals)
		boolean isEqual2=result1.equals(result2);
		boolean isEqual3=result1.equals("kimgura");
		boolean isEqual4="kimgura".equals(result1);
		
		// �̷��� �� ��ġ�� �������� �ֵ� ���ڸ� �ٷ� �Է��ϵ� �������
	}
}
