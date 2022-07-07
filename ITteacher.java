/*
@author:owashim chowdhury
Q.2… In this example, you have a base class Teacher and a sub class ITTeacher.
Since class ITTeacher extends the designation and college properties and work () method from base class,
we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the teachers so we have declared them in the base class, 
this way the child classes like Math Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used directly from base class.
*/
package Lab;

class Teacher{	//parent class
	String designation="designation is teacher,";
	String collegename=" college is IMPS";
	void work() {
		System.out.println("work is Teaching");
	}
}
 class ITteacher extends Teacher {	//child class

	public static void main(String[] args) {
		ITteacher te=new ITteacher();
		System.out.println(te.designation+" "+te.collegename);
		te.work();	//calling a  parent class method
	}	//end of main method

}	//end of class
