package forLoopsPatternPractice;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter half of the number of rows.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("  ");
			} 
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
		for(int i=0;i<2*n+1;i++) {
			System.out.print("  ");
		}System.out.println();

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=i;j<=2*n-i;j++) {
				System.out.print("  ");
			} 
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
