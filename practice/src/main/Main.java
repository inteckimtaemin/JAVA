package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int A = scan.nextInt();
	    int B = scan.nextInt();
	    
	    if((A>=10000*-1)&&(A<=10000)){
	    	if((B>=10000*-1)&&(B<=10000))	{
		        if(A>B){
		            System.out.println(">");
		        }
		        if(A==B){
		            System.out.println("==");
		        }
		        if(A<B){
		            System.out.println("<");
		        }
	    	}
	    }
	}
}
