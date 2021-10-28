package arrays;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for matrix multiplication.");
		System.out.println("Enter the number of rows and columns of matrix 1.");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		
		System.out.println("Enter the number of rows and columns of matrix 2.");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		if(col1 != row2) System.out.println("Matrix multiplication is not possible as number of columns in matrix 1 is not equal to the number of rows in matrix 2.");
		else { System.out.println("Matrix multiplication is possible.");
		int a[][] = new int[row1][col1];
		int b[][] = new int[row2][col2];
		System.out.println("Enter the elements of the first matrix :");
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				 a[i][j] = sc.nextInt();
			}
				System.out.println();
		}System.out.println("Enter the elements of the second matrix :");
		for(int i=0; i<row2; i++) {
			for(int j=0; j<col2; j++) {
				 b[i][j] = sc.nextInt();
			}System.out.println();
				
		}  int c[][] = new int[row1][col2];
				
				for(int i=0; i<row1; i++) {
					
					for(int k=0; k<col2; k++) {
						
						int sum=0;
					for( int j=0; j<col1; j++) {
						sum = a[i][j] * b[j][k];
						c[i][k] +=sum;
					}     } 
				}
				System.out.println("Final matrix after multiplication is :");
				for(int i=0; i<row1; i++) {
					for(int j=0; j<col2; j++) {
						System.out.print(c[i][j] + " ");
					}System.out.println();
					}

	}

}}
