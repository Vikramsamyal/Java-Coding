package nestedForLoops;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	          System.out.println("Enter value for rows and column.");
	          int x = sc.nextInt();
	          for(int i=1; i<=x; i++) {
	        	  for(int j=1; j<i; j++) {
	        		  System.out.print("  ");
	        	  }
	        	  
	        	  
	        	  for(int j=i; j<=x; j++) {
	        		  System.out.print("* ");
	        	  }System.out.println();
	          }
		
		
		
		
		
		
		

	}

}
