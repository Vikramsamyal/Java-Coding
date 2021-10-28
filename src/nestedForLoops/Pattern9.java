package nestedForLoops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	          System.out.println("Enter value for rows and column.");
	          int x = sc.nextInt();
	          System.out.println("*");
	          
	              for(int i=2; i<=x-1; i++) {
	            	  System.out.print("* ");
	            	  
	        	  for(int j=1; j<=i-2; j++) {
	        		  System.out.print("  ");
	        	  }
	        	  System.out.println("*");
	          }
	              
	              
	              
	              
	              if(x>1) {for(int i = 1; i<=x; i++) {
	            	  System.out.print("* ");
	              }}
	}

}
