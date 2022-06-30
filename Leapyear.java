/*
Author:Owashim Chowdhury
*/
//java program to check leap year or not
package Owas;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);  
		 for(int i=1;i>=0;i++) {
		System.out.println("enter Year:");  //taking input
		  int year =sc.nextInt();
		 
if (year%4==0){ //logic
	System.out.println("yes, this is leap year");
     }
else{
	System.out.println("no,this is not leap year");
    }
}		//end of for loop
}
}	//end of class
