/*
 * author:owashim chowdhury
 * java program of interface
 */
package Lab;

import java.util.Scanner;

interface AdvancedArithmetic{
	  int divisor_sum(int n);
	}
//class implements interface
	class MyCalculator implements AdvancedArithmetic {
	    public int divisor_sum(int n) {
	        int sum=0;
	        for(int i=1;i<=n;i++) {
	            if(n%i==0)
	                sum+=i;
	        }
	        return sum;
	    }
	}
	
public class MyCalculator1 {
//main method
	public static void main(String[] args) {
	MyCalculator m=new MyCalculator();	//creating object of myCalculator class
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	sc.close();
	System.out.println("sum of the divisor is :"+m.divisor_sum(n));

	}

}
