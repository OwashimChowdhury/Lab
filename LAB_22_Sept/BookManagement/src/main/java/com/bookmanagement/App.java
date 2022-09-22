package com.bookmanagement;

import java.util.Scanner;


import com.bookmanagement.daoimpl.BookDaoimpl;

public class App 
{
    public static void main( String[] args )
    {
    	//object of bookdaoimpl
    	  BookDaoimpl d = new BookDaoimpl();
         char c;
         do{
      	   Scanner sc = new Scanner(System.in);
      	   System.out.println("PRESS 1 for add Book \nPRESS 2 for display Book\nPRESS 3 for Exit");
      	   int a = sc.nextInt();
      	   switch(a) {
      	   //calling addbook method
      	   case 1: d.addBook();
      	   break;
      	//calling fetchbook method
      	   case 2: d.fetchBook();
      	   break;
      	 
      	 
      	   case 3: System.exit(0);
      	   break;
      	   default: System.out.println("Invalid Choice!");
      	   }
      	   System.out.println("Do you want to continue? Y/N");
      	   c = sc.next().charAt(0);
         }while(c == 'y' || c == 'Y');
         System.out.println("Thank You");
    }
}
