package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// �⺻ ������ Ÿ�� double
		double num1=10.1;
		// ���� ������ Ÿ�� Double
		Double num2=10.2;
		
		// ���� ������ Ÿ�� Double������ ��ġ �⺻������ Ÿ�԰� ���� ����� �� ����
		double result1=num2+10;
		double result2=num1+num2;
		Double result3=num1+num2;
		
		// ���ڸ� ���ڿ��� �ٲٱ�  10.1 => "10.1" / non-static method
		String strNum=num2.toString();
		
		// ���ڿ��� ����(double)�� �ٲٱ�  "10.3" => 10.3  / static method
		double result4=Double.parseDouble("10.3");
	}
}
