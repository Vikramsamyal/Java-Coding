package loops;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the base value.");
               int x = sc.nextInt();
               System.out.println("Enter the power.");
               int y = sc.nextInt();
               int result = 1;
               for(int i=0;i<y;i++) {
//            	 result = result * x;                                         {alternate method}
            	 result *= x;
               }  System.out.println("The result is " + result + ".");
	}
 
}
