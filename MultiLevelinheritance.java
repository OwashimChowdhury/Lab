/*
@author:Owashim chowdhury
Q.3… Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)
*/
package Lab;

class A{ //parent class
	void run() {
		System.out.println("owashim");
	}
}
	class B extends A{	//child class of A
		void features() {
			System.out.println("IS A good");	
		}
	}
	class C extends B{	//child class of B
		void display() {
			System.out.println("BOY");
		}
	}

public class MultiLevelinheritance {

	public static void main(String[] args) {
		C sc1=new C();	//object of child class C 
		sc1.run();	//calling parentClass Method 
		sc1.features();	//calling Child class method
		sc1.display();	//calling child class method
		
	}
}
