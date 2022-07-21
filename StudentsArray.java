/*
 * author owashim chowdhury
 * Q.4   Create a student class having the following attributes
1. Student No. (Data type int)
2. StudentName. (Data type String)
3. Student Mail Id. (Data type String)
4. StudentAddress. (Data type String)
This class should have 2 methods
1. void fees (Int Student No.)
2. void display (Int Student number)

•	After the class, you need to create an array of Student having 5 Students
assign different fees to each Student and also print the details of each
Student with the array only.


•	Now create a static method in the main class which will accept Student
number and Studentfees as parameter and if the feesare less than 2000
then fees will increase by10% of their current fees to that Student.

•	Call the display method to print the updated details.
•	

 */
package Array;

public class StudentsArray {
		int StudentNo;
		String Student_Name,Student_mailId,StudentAdress;
		int fees;
	    //creating a constructor
		 StudentsArray(int no,String name,String mail,String address,int fees ){
			this.StudentNo=no;//referring current class instance variable 
			this.Student_Name=name;//referring current class instance variable 
			this.Student_mailId=mail;//referring current class instance variable 
			this.StudentAdress=address;//referring current class instance variable 
		if (fees<2000) {//logic if fees<2000 this statement will execute
    		fees=fees+(10*fees/100);}
		this.fees=fees;//referring current class instance variable 
	
		}
	    void display() {
System.out.println("studentNo.:"+StudentNo+" Name:"+Student_Name+"  MailId:"+Student_mailId +"  Adress:"+StudentAdress+" fees:"+ fees );
	    }
	    public static void main(String[] args) {
	    	StudentsArray array[]=new StudentsArray[5];//declaring an array
	    	array[0]=new StudentsArray(101,"owashim","owashim@gmail.com","malda,WB",3000);//initializing value
	    	array[1]=new StudentsArray(102,"tarun","tar@gmail.com","kolkata",4000);//initializing value
	    	array[2]=new StudentsArray(103,"riya","bshb@gmail.com","malda",1500);//initializing value
	    	array[3]=new StudentsArray(104,"rahul","rahul@gmail.com","U.k",3000);//initializing value
	    	array[4]=new StudentsArray(105,"ajay","aj@gmail.com","kolkata",9000);//initializing value
	    
	    	for (StudentsArray elements:array) {//for each loop to print array elements
	    		elements.display();//calling display method
	    	}    	
		}
	}



