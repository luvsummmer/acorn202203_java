package test.mypac;

public class Rect {
	// �ʵ�
	public int width;
	public int height;
	
	// �޼ҵ� 1 - ������ �ֿܼ� ���
	public void showArea() {
		//���� ����
		int area=width*height;
		//�ֿܼ� ����ϱ�
		System.out.println("����:"+area);
		// ���� ���� ���̸� �ٸ��� �־ new �� ������ ��� ���� �� ���� !
	}
	
	// �޼ҵ� 2 - ������ �޼ҵ带 ȣ���� ������ ��������(������Ÿ���� int) - �߸��Ե� !!
	public int getArea() {
		int area=width*height;
		return area;
	}
}	


	//���� �� �� - �̰ŵ� ����
	//public void showArea() {
	//	System.out.println("�簢���� ���̴� "+width*height);
	//}

