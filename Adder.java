/*
Author:Owashim Chowdhury
Q.1… Write the following code:
	a)A class named Arithmetic with a method named add that takes integers as parameters and returns an integer denoting their sum.
	b)A class named Adder that inherits from a superclass named Arithmetic
*/

package Lab;

class Arithmatic{	//super class
	 int a;
	 int b;
	 int sum;
	 int add(int a,int b) {	//method 1
		return sum=(a+b);
	}
	
}
 class Adder extends Arithmatic {	//sub class
	 void display() {	//method 2
			System.out.println(sum);
		}
	public static void main(String[] args) {
		Adder ac=new Adder();	//object of sub class
		ac.add(55, 66);	//calling method of super class
		ac.display();	//calling method of sub class
	}	//end of main method
}	//end of class
