package com.hibernate.hibernatedemo;

import java.util.Scanner;

import com.hibernate.hibernatedemo.Daoimpl.StudentDaoImpl;

public class App 
{
	public static void main( String[] args )
    {
	//creating object of StudentDaoImpl class
       StudentDaoImpl dao = new StudentDaoImpl();
       char c;
		//creating do while loop
       do{
	       //creating scanner class object
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("PRESS 1 for add student \nPRESS 2 for display student \nPRESS 3 for update \nPRESS 4 for delete \nPRESS 5 for Exit");
    	   int a = sc.nextInt();
    	   switch(a) {
	  //calling addstudent method
    	   case 1: dao.addStudent();
    	   break;
	//calling fetchstudent method
    	   case 2: dao.fetchStudent();
    	   break;
	//calling updatestudent method	   
    	   case 3: dao.updateStudent();
    	   break;
	 //calling deletestudent method
    	   case 4: dao.deleteStudent();
    	   break;
    	   case 5: System.exit(0);
    	   break;
    	   default: System.out.println("Invalid Choice!");
    	   }
    	   System.out.println("Do you want to continue? Y/N");
    	   c = sc.next().charAt(0);
       }while(c == 'y' || c == 'Y');
       System.out.println("Thank You");
    }
}
