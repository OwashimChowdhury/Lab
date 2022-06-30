/*
 * @author:owashim chowdhury
 * java program to print a pyramid pattern
 */

package Owas;

public class PyramidPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {		//logic
			for(int j=5-i;j>=1;j--) {
				System.out.print(" ");	//printing space
			}
			for(int k=i;k>=1;k--) {
				System.out.print("* ");	//printing star
			}
			System.out.println(" ");
		}	//end of for loop
		
	}	//end of main method

}	//end of class
