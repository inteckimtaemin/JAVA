package study01;

public class Test {

	public static void main(String[] args) {

		String str = new String("자바 너무 좋아요!!!");
		String s = new String("  자바 !!!  ");
		
		System.out.println(str.length());//문자열의 길이를 알려주는 메소드 (공백까지 추가)
		System.out.println(str.charAt(3));//괄호 안의 수번째의 문자를 알려줌 처음 시작은 0부터 시작 
		System.out.println(str.equals(s));//괄호안의 문자열과 .equals앞의 문자열을 비교하여 알려줌
		int i = 100;
		String s2 = String.valueOf(i);//값을 바꿔준다.
		System.out.println(s2+100);
		
		System.out.println(str.substring(3));//3번째부터 문자열 출력
		System.out.println(str.substring(3,5));//3번째부터 5번째까지 출력
		
		System.out.println(s.trim());//앞뒤 공백 제거
		System.out.println(s.indexOf("자"));//자가 몇번째 문자인지 알려줌
		
	}

}
