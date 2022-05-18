package study;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("별을 출력할 행 수를 입력하여주세요 >> ");
        int num = scan.nextInt();

        for(int i =1; i <= num; i++) {
            for(int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
