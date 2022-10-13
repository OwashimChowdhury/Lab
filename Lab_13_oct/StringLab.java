package com.practice;
//author: owashim chowdhury
import java.util.Scanner;

public class StringLab {
	//creating scanner class object
	Scanner sc=new Scanner(System.in);
  	public void show() {
  		//taking input
	System.out.println("Enter  word1:");
	String a=sc.next();
	System.out.println("enter  word2:");
	String b=sc.next();
	
	//statement 1. sum of length of a & b string
	System.out.println("sum of length of two String is:"+(a.length()+b.length()));
	
	//statement2. Compares two strings lexicographically
	if(a.compareTo(b)<0) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
	//statement3. capitalize only 1st letter and print together
	System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " + b.substring(0, 1).toUpperCase()
			+ b.substring(1));
	
  	}
	
	public static void main(String[] args) {
		//creating object of String lab class
		StringLab sl=new StringLab();
		sl.show();

	}

}
