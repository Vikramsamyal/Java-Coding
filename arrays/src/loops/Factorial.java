package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a number for it's Factorial");
        int fact = sc.nextInt();
        int result = 1;
        for(int i= fact; i>50; i-- ) {
         result = result * i;
        } System.out.println(result);
	}

}
