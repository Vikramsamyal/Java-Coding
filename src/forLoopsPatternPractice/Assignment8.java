package forLoopsPatternPractice;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows.");
	int n = sc.nextInt();
	for(int i=0; i<n; i++) {
		int number=1;
		for(int j=1;j<=n-i; j++) {
			System.out.print("  ");
		}
	    for(int j=0; j<=i; j++) {
	    	System.out.print(number+"   ");
	    number= number*(i-j)/(j+1);
		}System.out.println();
	}

	}

}
