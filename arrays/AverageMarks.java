package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int numberOfStudents = sc.nextInt();
		int[] marks = new int[numberOfStudents];
		System.out.println("Kindly, Enter the marks of student in order.");
		for(int i=0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<numberOfStudents; i++) {
			sum += marks[i];
		} float average = sum / numberOfStudents;
		System.out.println("Average marks are " + average);

	}

}
