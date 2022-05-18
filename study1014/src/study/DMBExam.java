package study;

public class DMBExam {

	public static void main(String[] args) {

		DMBCellPhone ex = new DMBCellPhone("안드로이드","흰색",100);
		System.out.print("\n");
		ex.powerOn();
		ex.Bell();
		ex.sendvoice("여보세요? 송중기(김태민)입니다.");
		ex.receivevoice("안녕하세요. 저는 상대방입니다.");
		ex.sendvoice("안녕히 가십쇼.");
		ex.hangup();
		System.out.print("\n");
		ex.TurnOn();
		ex.ChangeChannel(20);
		ex.TurnOff();
		
	}

}
