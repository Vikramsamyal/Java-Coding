package loops;

import java.util.Scanner;

public class AnotherSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Give value for the number of terms in the summation of series.");
          int x= sc.nextInt();
          float sum = 0;
          for(float i=1; i<=x; i++) {
        	  sum += 1/i;
        	  
          } System.out.println("The summation of the series is " + sum + ".");
          
	}

}
