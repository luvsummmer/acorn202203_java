package test.main;

public class MainClass11 {
	public static void main(String[] args) {
		// ������ ���ѷ��������� Ư�� ���ǿ��� Ż���ϴ� �ݺ��� (break �̿�)
		int count=0;
		// ��Ȯ�� �ݺ� Ƚ���� �� �� ���� �� ����� �� �ִ� �ݺ���
		while(true) {
			count++;
			System.out.println("�ݺ� Ƚ��:"+count);
			
			if(count==1000) {
				break;  // ������ ��(�ݺ���) Ż��
			}
		}
	}
}
