package test.main;
/*
 * 4. �������� �׽�Ʈ
 */
public class MainClass04 {
	public static void main(String[] args) {
		// or ����
		/*
		 * '�Ǵ�' �̶�� ����
		 * ��� �ϳ��� true�̸� ����� true
		 * ��� �� false�϶��� ����� false
		 */
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		
		// and ����
		/*
		 * '�׸���' ��� ����
		 * ��� �� true�϶��� ����� true
		 * ��� �ϳ��� false�̸� ����� false
		 */
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		
		// not ����
		/*
		 * '~�� �ƴϸ�' �̶�� ����
		 * boolean���� ������Ŵ (true�̸� false, false�̸� true)
		 */
		boolean result9 = !true; //false
		boolean result10 = !false; //true
	}
}
