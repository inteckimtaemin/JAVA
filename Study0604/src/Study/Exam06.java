package Study;

import java.util.Scanner;

public class Exam06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int su = 0;
        int sum = 0;
        int[] scores = new int[100];
        stu : while(true) {
        System.out.println("-------------------------------------------------");
        System.out.println("1.�л� �� | 2.���� �Է� | 3.���� ����Ʈ | 4.�м� | 5.����");
        System.out.println("-------------------------------------------------");
        System.out.print("���� >> ");
        int num = scan.nextInt();
        switch(num) {
        case 1:
            System.out.print("�л� �� >>");
            su = scan.nextInt();
            break;
        case 2:
            for(int i = 0;      i < su; i++) {
                System.out.printf("scores[%d] > ", i );
                scores[i] = scan.nextInt();
                }
            break;
        case 3:
            for(int i = 0; i < su; i++) {
                System.out.printf("scores[%d] > %d\n", i , scores[i]);
                }
            break;
        case 4:
            int max;
            double avg;
            max = scores[0];
            for(int i = 0; i < su; i++) {
                if(max < scores[i]) {
                    max = scores[i];
                } 
                sum += scores[i];
            }
            avg = (double)sum / su;
            System.out.println("�ְ� ���� : " + max);
            System.out.println("��� ���� : " + avg);
            break;
         default:
             System.out.println("���α׷� ����");
             break stu;
        }
    }
    }
}