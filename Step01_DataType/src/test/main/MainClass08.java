package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result=str.length();
		char result2=str.charAt(0);
		/*
		 * ������������ Ư¡ !
		 * 
		 *  String ��ü�� �޼ҵ带 Ȱ���ؼ�
		 *  str ���� �ȿ� �ִ� ���ڸ� ��� �빮��(UpperCase)�� ��ȯ�ؼ�
		 *  str2��� �̸��� ������ ��ƺ�����
		 */
		
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, Bye! mimi";
		// ���� ���ڿ����� String ��ü�� �޼ҵ带 Ȱ���� 
		// mimi��� ���ڿ��� mama��� ���ڿ��� ��ü�ؼ� ����� greet2�� ��� ������.
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is kimgura";
		/*
		 * 1. ���� ���ڿ��� My ��� ���ڷ� �����ϴ��� ����(true or false)�� isStart��� ������ ��ƺ�����.
		 * 2. ���� ���ڿ����� i �� ���ڿ��� ���° �ε����� ��ġ�ϰ� �ִ����� index��� ������ ��ƺ�����.
		 */
		boolean isStart=message.startsWith("My");
		int index=message.indexOf("i");

	}
}
