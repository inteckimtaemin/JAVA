package study;

public class KoreanExam {

	public static void main(String[] args) {

		Korean Kor1 = new Korean("�Ѱܿ�","1234-5678");
		Korean Kor2 = new Korean("���޷�","3456-7890");
		
		System.out.println("����= "+Kor1.nation);
		System.out.println("�̸�= "+Kor1.name);
		System.out.println("�ֹι�ȣ= "+Kor1.ssn);
		
		System.out.println("����= "+Kor2.nation);
		System.out.println("�̸�= "+Kor2.name);
		System.out.println("�ֹι�ȣ= "+Kor2.ssn);
		
	}

}
