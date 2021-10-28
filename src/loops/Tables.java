package loops;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number for it's table.");
		int tableOf = sc.nextInt();
//		int result = 0;
//		for(int i=1; i<=10; i++) {
//			result = i * tableOf;
//			System.out.println(result);
		
//		alternate and step reducing method
		for(int i=1; i<=10; i++) {
			System.out.println(i * tableOf);
		}

	}

}
