package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();  // �����ڰ� ��� ����X => �⺻�����ڰ� �ִٰ� ���ֵǱ� ����
		s1.study();
		
		new Student().study();
		new Student().goSchool();		
		
		// �������ڸ��� �ʵ忡 ȸ������ �� ����ְ� ��
		Member m1=new Member(1, "�豸��", "�뷮��"); 
		Member m2=new Member(2, "�ذ�", "��ŵ�"); 
		Member m3=new Member(); // num 0, �������� null �������
		
		// new Member(); => �����ڸ� �ϳ��� �����ϸ� �⺻ �����ڴ� ����� !
		// �ٵ� �⺻�����ڵ� ����ϰ� ������ �ٽ� �����ϸ� �� => Member Ŭ�������ٰ�
		

	}
}
