package nestedForLoops;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	          System.out.println("Enter value for rows and column.");
	          int x = sc.nextInt();
	          for(int i=1; i<=2*x-1; i++) {
	        	  if(i<=x) {for(int j=1; j<=i; j++) {
	        		  System.out.print("* ");
	        	  }}  else {for(int j=1; j<= 2 * x - i;j++) {
	        		  System.out.print("* ");
	        	  }}
	        	  
	        	  System.out.println();
	          }

	}

}
