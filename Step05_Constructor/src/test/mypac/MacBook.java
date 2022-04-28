package test.mypac;

public class MacBook {
	
	// ����� �ʵ�, �ܺο��� ���� �Ұ��ϵ��� ���� �����ڸ� private�� �ؼ� �ʵ� 3�� �����ϱ�
	private Cpu cpu; // ����������Ÿ�� : ���� �ϸ� null ����
	private Memory memory;
	private HardDisk hardDisk;
	
	// ������ - �ʵ忡 �ʿ��� �� �ֱ�
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	
	// �޼ҵ� - ��ǰ�� null�� �� �������� �ʴ� ��� ����� ����
	public void doGame() {
		if(cpu==null || memory==null || hardDisk==null) {
			System.out.println("��ǰ�� �����ؼ� �ƺ��� ������ �� �� �����ϴ�.");
			return; // �޼ҵ带 ���⼭ ������
		}
		System.out.println("�ų��� ������ �ؿ� !");
	}
}
