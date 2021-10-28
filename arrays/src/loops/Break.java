package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter values.");
      for(; ; ) {
    	  int x = sc.nextInt();
    	  if(x<0)   break; 
      
	} System.out.println("You entered negative value, PROGRAM TERMINATED.");

}}
