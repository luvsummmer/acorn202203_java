package test.main;
/*
 * [ �⺻ data type�� ���� data type ]
 * 
 * byte    : Byte
 * short   : Short
 * int     : Integer
 * long    : Long
 * 
 * float   : Float
 * double  : Double
 * 
 * char    : Character
 * boolean : Boolean
 * 
 * (int, char ����� �� �ձ��ڸ� �빮�ڷ� �ٲٸ� ��) / ��״� �⺻��Ű���� import�� �ʿ� x
 * 
 * - ���δ� �⺻������ type�� ���������� type�� �ʿ��� ���� ����
 * - �⺻������ type�� ��ü�� ����(boxing)�ϴ� ���� ! => Wrapper Class��� ��
 * - boxing�� unboxing�� �ڵ����� �Ǳ� ������ ���α׷��Ӱ� �Ű澵 �ʿ� ����
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		// �⺻ ������ type
		int num1=10;
		// ���� ������ type
		Integer num2=10;
		
		// ���������� type������ �⺻������typeó�� ����� �� �ִ�
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;  // �����ؼ� �⺻�����ͷθ���� ���������ͷθ���� ����
		
		// ���ڸ� ���ڷ� �ٲٱ�  10 => "10"
		String strNum=num2.toString();  // ���� ����***
		
		// ���ڸ� ���ڷ� �ٲٱ�
		String strNum2="999";
		// Integer Ŭ������ static �޼ҵ� �̿��ϸ� ��(Integer�� ������)
		int result4=Integer.parseInt(strNum2);  // ���� ����*** , �ڽ����� Number����
	}
}
