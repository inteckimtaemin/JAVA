package study01;

public class Test {

	public static void main(String[] args) {

		String str = new String("�ڹ� �ʹ� ���ƿ�!!!");
		String s = new String("  �ڹ� !!!  ");
		
		System.out.println(str.length());//���ڿ��� ���̸� �˷��ִ� �޼ҵ� (������� �߰�)
		System.out.println(str.charAt(3));//��ȣ ���� ����°�� ���ڸ� �˷��� ó�� ������ 0���� ���� 
		System.out.println(str.equals(s));//��ȣ���� ���ڿ��� .equals���� ���ڿ��� ���Ͽ� �˷���
		int i = 100;
		String s2 = String.valueOf(i);//���� �ٲ��ش�.
		System.out.println(s2+100);
		
		System.out.println(str.substring(3));//3��°���� ���ڿ� ���
		System.out.println(str.substring(3,5));//3��°���� 5��°���� ���
		
		System.out.println(s.trim());//�յ� ���� ����
		System.out.println(s.indexOf("��"));//�ڰ� ���° �������� �˷���
		
	}

}
