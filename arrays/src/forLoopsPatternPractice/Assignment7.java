package forLoopsPatternPractice;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows.");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int s =n+1-i;
			int p=n-1;
			
			for(int j=0; j<n-i; j++) {
				System.out.print("  ");
			}for(int j=1; j<=2*i-1; j++) {
				
		if(j==i)		System.out.print(0 + " ");
		else if(j<i) {System.out.print(s + " ");
		s++;}
		else {System.out.print(p + " ");
		p--;	} 
			
		}System.out.println();

	}

}}
