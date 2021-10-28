package conditionalStatements;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number to check where it lies.");
		int x = sc.nextInt();
		if(x < 10) {
			System.out.println("Number is less than 10.");
		} else if(x >= 10 && x <= 20) {
			System.out.println("Number lies between 10 and 20.");
		} else if(x >= 20 && x <= 30) {
			System.out.println("Number lies between 20 and 30.");
		}else System.out.println("Number is greater than 30.");

	}

}
