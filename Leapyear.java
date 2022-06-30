package Owas;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		 for(int i=1;i>=0;i++) {
		System.out.println("enter Year:");
		  int year =sc.nextInt();
		 
if (year%4==0){
	System.out.println("yes, this is leap year");
     }
else{
	System.out.println("no,this is not leap year");
    }
}
}
}