/*
 * author owashim chowdhury
 *Q.2   Write a Java program to find the duplicate values of an array of integer values.
 */
package Array;

public class ArrayDuplicateValue {

	public static void main(String[] args) {
		
		int array[]= {5,2,7,7,5};//declaring and initializing the array
		System.out.print("duplicate values:");
		for (int i=0;i<array.length;i++) {//for loop to compare the array elements
			for (int j=0;j<array.length;j++) {//inner loop
				if(i==j) {
					continue;
				}
				if(array[i]==array[j]) {//if elements match if statement will execute 
					System.out.print(array[i]+" ");//printing the duplicate values
				}
				}
			}
	}
}
