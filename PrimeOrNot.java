/*
Author:Owashim Chowdhury
*/
//java program to check a number is prime or not
package Owas;

public class PrimeOrNot {		//class

	public static void main(String[] args) {
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number."); //print
	    else
	      System.out.println(num + " is not a prime number.");  //print
	 

	}		// end of main method

}		//end of class
