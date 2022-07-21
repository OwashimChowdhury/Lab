/*
 * author owashim chowdhury
 * Q.1   Write a Java program to test if an array contains a specific value
 */
package Array;
public class ArrayContainThisOrNot {

	public static void main(String[] args) { 
		int []array= {1789,2035,1899,1456,2013};//declaring and initializing array
		int contain=2013;
		for (int i =0;i<array.length;i++) {//for loop to check this array element is present or not.
			if(array[i]==contain) {//if present the statement will execute
				System.out.println(array[i]+" is present in array");}//print
		}
	}
}
