/*
 * author:owashim chowdhury
 * java program to print even no.s of an array
 */
package Array;

import java.util.Scanner;

public class ArrayEvenNo {
	

	public static void main(String[] args) {
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length:");//taking array length from user
		int arraylength=sc.nextInt();
		int [] array=new int[arraylength];//declaring an array
		System.out.println("enter the elements");//taking the elements of an array from user 
		for(int i=0;i<arraylength;i++) {	//for loop to store the value index wise
			array[i]=sc.nextInt();//storing the value index wise
		}
    int evenno = 0;
    for(int i=0;i<array.length;i++) {//for loop to find even no.
    	if(array[i]%2!=0) //logic
    		continue;//continue because if !=0 means its a odd no.
    		evenno=array[i];//initializing the value of even numbers.
    		 
    	 System.out.println("even no.s are"+evenno);//printing the even numbers
    }
   
	}
}
