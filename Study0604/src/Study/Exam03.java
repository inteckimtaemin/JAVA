package Study;

public class Exam03 {

	public static void main(String[] args) {

		int [][] array = { {95, 86}, {83,92,96}, {78,83,93,87,88} };
		int sum=0;
		double avg=0;
		int a=0;
		for(int i = 0 ; i<array.length ; i++)
		{
			for(int j = 0 ; j < array[i].length ; j++)
			{
				sum += array[i][j];
				
			}
			a+=array[i].length;
		}
		avg = (double)sum/a;
		System.out.printf("sum : %d\navg : %.1f",sum, avg);
	}

}
