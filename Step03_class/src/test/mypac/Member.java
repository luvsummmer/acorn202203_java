package test.mypac;

public class Member {
	
	// �����(field), ���赵�� �Ұ� ( ���⼭�� static �Ⱦ� ! static�� ��ü�� ������� )
	public int num;  // public : ����, ��𼭵��� �� �ʵ带 ���ٰ����ϵ���(import) �ϰڴ�
	public String name;
	public String addr;
	
	// ���(method)
	public void showInfo() {
		// �ʵ忡 ����� ������ �Ʒ��� ���� �������� �ܼ�â�� ����ϴ� �ڵ带 �ۼ��� ������.
		// ��ȣ:1, �̸�:�豸��, �ּ�:�뷮��
		// ��� �� ��ü ��ü���� ������ �Ŵϱ� ������ �� ��ü�� ����Ű�� this ��� ����		
		System.out.println("��ȣ:"+this.num+", �̸�:"+this.name+", �ּ�:"+this.addr);
	}
	

}
