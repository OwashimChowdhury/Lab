package com.ums;

import com.ums.daoimpl.UniversityDaoimpl;

public class App 
{
    public static void main( String[] args )
    {
    	//object of Universitydaoimpl
     UniversityDaoimpl u=new UniversityDaoimpl();
     //calling addstudent method
     u.addStudent();
     //calling fetch student method
     u.fetchStudent();
    }
}
