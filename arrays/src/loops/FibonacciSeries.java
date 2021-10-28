package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter value for number of terms required in the Fibonacci Series.");
	         int x = sc.nextInt();
	         int a = 0;
	         int b = 1;
	         System.out.print(a + " ");
	         System.out.print(b + " ");
	         for(int i=0; i<x-1; i++) {
                   int c = a + b;
                   System.out.print(c + " ");
                   a = b;
                   b = c;
	     
	        	 
	        			
	        		
	         }
	
	
	}

}
