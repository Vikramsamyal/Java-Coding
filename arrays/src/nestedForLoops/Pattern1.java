package nestedForLoops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter value for rows and column.");
          int x = sc.nextInt();
          for(int i=0; i<x; i++) {
        	  for(int j=0; j<x; j++) {
        		  System.out.print("* ");
        	  }System.out.println();
          }
          
	
	}

}
