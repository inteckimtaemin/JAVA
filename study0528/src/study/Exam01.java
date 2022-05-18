package study;

public class Exam01 {

	public static void main(String[] args) {

		//String[] scores = new String[4];
		int sum = 0;
		double avg;
		int[] scores = {80, 78, 94, 88};
		/*int[] scores ;
		scores = new int[] {80, 78, 94, 88};*/
		
		//int [] scores = new int[4];
		//scores [0]=80;
		//scores [1]=78;
		
		for(int i =0; i<scores.length; i++)
		{
			System.out.printf("scores[%d] = %d\n", i , scores[i]);
			sum+=scores[i];
		}
		System.out.println("배열 항목의 총합 = "+ sum);
		
		avg = (double) sum/scores.length;
		
		System.out.println("배열 항목의 평균 = "+ avg);
	}

}
