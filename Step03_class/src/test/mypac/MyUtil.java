	package test.mypac;

public class MyUtil {
	
	// static ���� : MyUtil�� static����, version�̶�� ����Ҷ� send��� �޼ҵ尡 �ִ� ��
	
	// �ʵ�
	public static String version;  // ����������Ÿ�� : ���� �ϸ� null�� ������� => ���߿� ������ �� ����(heap���� ��ü�� ã��)
	
	// �޼ҵ�
	public static void send( ) {
		System.out.println("�����մϴ�");
	}
}
