package study;

public class DMBExam {

	public static void main(String[] args) {

		DMBCellPhone ex = new DMBCellPhone("�ȵ���̵�","���",100);
		System.out.print("\n");
		ex.powerOn();
		ex.Bell();
		ex.sendvoice("��������? ���߱�(���¹�)�Դϴ�.");
		ex.receivevoice("�ȳ��ϼ���. ���� �����Դϴ�.");
		ex.sendvoice("�ȳ��� ���ʼ�.");
		ex.hangup();
		System.out.print("\n");
		ex.TurnOn();
		ex.ChangeChannel(20);
		ex.TurnOff();
		
	}

}
