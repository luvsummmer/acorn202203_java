package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�");
		
		//��������
		int kor=95;
		//��������
		int eng=100;
		
		//���� ������ ���� ������ ����� �Ҽ������� ���ؼ� ������ ��� �� ����� �ܼ�â�� ����� ������.
		double avg=(kor+eng)/2d;
		
		System.out.println("���:"+avg);
		// �ڹٿ��� �������� �����ϸ� ����� �����θ� ���� ! �Ҽ��� �߸� �� ����
		// ���� ���߿� �ϳ��� �Ǽ��� ������ֱ� -> 2d Ȥ�� 2.0 Ȥ�� 2f => ����� �Ǽ� !
	}
}
