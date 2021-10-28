package conditionalStatements;
import java.util.Scanner;

public class IfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly, enter your age.");
		int age = sc.nextInt();
            if(age >= 18) {
            	System.out.println("You can vote now.");
            	
      }  else System.out.println("You are not eligible to vote.");
	}

}
