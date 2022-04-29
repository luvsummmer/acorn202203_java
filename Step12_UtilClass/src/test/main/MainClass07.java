package test.main;

import java.util.HashMap;
import java.util.Map;
/*
 *  HashMap<key ���� type, value ���� type>
 *  
 *  key �� generic class �� String ���� �����ϴ°��� �Ϲ����̴�.
 *  value �� generic class �� ���� ������ type �� �����ϸ� �ȴ�.
 *  �������� type �� ��� �����Ÿ� Object �� �����ϸ� �ȴ�.  
 */
public class MainClass07 {
	public static void main(String[] args) {
		final Map<String, Object> map1=new HashMap<>(); // �� �տ� final ���̸� �ٸ� ���� map1�� ���� ���ϰ� ���ȭ
		/*
		 *  ������ ������ HashMap ��ü�� ������ ���� ���� 3������ ��ƺ�����.
		 *  ��ȣ : 1
		 *  �̸� : �豸��
		 *  �������� ���� : true
		 */
		
		map1.put("num", 1);
		map1.put("name", "�豸��");
		map1.put("isMan", true);
		
		// map1�� ��� ��ȣ�� num, �̸��� name, �������� ���δ� isMan �̶�� ���������� ��ƺ�����.
		// Key���� String���� �����ϱ� String, Value�� Object�ϱ� �� ��밡�������� Casting�ϱ�
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		// ���� : ������ key������ �ٽ� ���
		map1.put("name", "������");
		
		// Ư�� key������ ��� ���� ����, �����ϸ� true, �����ϸ� false ����
		map1.remove("isMan");
		
		// ��� ����
		map1.clear();
	}
}
