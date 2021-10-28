package nestedForLoops;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	          System.out.println("Enter value for rows and column.");
	          int x = sc.nextInt();
	          for(int i=0; i<x; i++) {
	        	  for(int j=0; j<x-i; j++) {
	        		  System.out.print("* ");
	        	  }System.out.println();
	          }
		
		
		
		
		
		
		
	}

}
