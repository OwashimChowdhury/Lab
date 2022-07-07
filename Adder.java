
package Lab;

class Arithmatic{
	 int a;
	 int b;
	 int sum;
	 int add(int a,int b) {	//method 1
		return sum=(a+b);
	}
	
}
 class Adder extends Arithmatic {
	 void display() {	//method 2
			System.out.println(sum);
		}
	public static void main(String[] args) {
		Adder ac=new Adder();
		ac.add(55, 66);
		ac.display();
	}

}
