package test.main;
/*
 *  [ Java �⺻ ������ type ]
 *  
 *  2. ���� (boolean)
 *  
 *  - true, false �ΰ��� ���� �ϳ��̴�.
 *  - true, false �� ���� ���ų� �񱳿��� Ȥ�� �� ������ ����� ���� �ִ�. 
 *  - ���� ������ ��Ÿ���� ������ type 
 */
public class MainClass03 {
	// run ���� �� ������ �帧�� ���۵Ǵ� ! Ư���� main method(�⺻ �޼ҵ�)
	public static void main(String[] args) {
		//���� ���� ����� ���ÿ� �� �����ϱ�
		boolean isRun=true;
		if(isRun) {
			System.out.println("�޷���");
		}
		
		//�񱳿����� ����� ����� boolean �� ���
		boolean isGreater=10>1;
		//�������� ����� ����� boolean �� ���
		boolean result=true||false;
		
		//�ѹ� ������ ������ �ٽ� ������ �� ���� ! !
		//boolean result=false; (�ߺ����� �ȵ�)
		result=false;  // ������ �ٸ� ���� ������ �� �ִ� (������ type�� ���)
		// �ٸ� type�� ���� ������ ���� �� ����.
		//result=10;
		
		// javascript : ����Ÿ��(dynamic type), Ÿ���� �׶��׶� �ٲ��
		// java : ����Ÿ��, ������ �����ϸ� ��ü�� �ڵ����� �þ, ��� �߸��� ������ �� ���ɼ� �پ��
	}
}
