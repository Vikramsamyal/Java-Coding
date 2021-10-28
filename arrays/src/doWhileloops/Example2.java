package doWhileloops;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter any positive number greater than zero.");
		int x = 1;
		do {  x = sc.nextInt();
			
			System.out.println("Number is "+ x); }
		while(x>0);

	}

}
