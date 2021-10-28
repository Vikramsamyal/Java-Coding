package forLoopsPatternPractice;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of rows.");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int k=1;
			for(int j=0; j<n-i; j++) {
				System.out.print("  ");
			}for(int j=1; j<=2*i-1; j++) {
				
				System.out.print(k + " ");
				k++;
			} 
			System.out.println();
		}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}


