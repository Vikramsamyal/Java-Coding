package nestedForLoops;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
          System.out.println("Enter value for rows and column.");
          int x = sc.nextInt();
          int y =1;
          for(int i=1; i<=x; i++) {
        	  for(int j=1; j<=x-i; j++) {
        		  System.out.print("  ");
        	  }
        	  
        	  
        	  for(int j=1; j<=i; j++) {
        		  
        		  System.out.print(y + "   ");
        		 y++;
        	  }System.out.println();
          }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
