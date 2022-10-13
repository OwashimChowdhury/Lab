package com.practice;
/*
 * given a number for each integer i in the range of 1 to n ..print 1 value per line .
1.if i is a multiple of 3 and 5 print "good morning"
2.if i is multiple only 3 not 5 print "good"
3.if i is multiple of 5 not 3 print "morning"
4.if i is not multiple of 3 and 5 print the value of i.
 */
import java.util.Scanner;

public class MultipleIf {
	int n;
	Scanner sc=new Scanner(System.in);
	///display method
	public void display() {
		System.out.println("Enter an integer:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0)//logic
				System.out.println("Good Morning");
			else if(i%3==0 && i%5!=0)//logic
				System.out.println("Good");
		
			else if(i%3!=0 && i%5==0)//logic
			System.out.println("Morning");
	
			else 
		System.out.println(i);
		}		
}	
	public static void main(String[] args) {
		MultipleIf m=new MultipleIf();
		m.display();//calling

	}

}
