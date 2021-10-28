package forLoopsPatternPractice;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows.");
	int n=sc.nextInt();
	System.out.println("*");
	for(int i=1; i<n-1; i++) {
		System.out.print("* ");
		for(int j=1; j<i; j++) {
			System.out.print("  ");
			
		}System.out.println("* ");
	}
	for(int i=0;i<n;i++) {
		System.out.print("* ");
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
