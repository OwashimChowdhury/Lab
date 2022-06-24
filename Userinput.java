/*
@author: Owashim Chowdhury
 
*/
//java program to take input from user

import java.util.Scanner;  // Import the Scanner class

class Userinput{ //created a class Userinput

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter your name:");

    String Name = a.nextLine();  // Read 
    System.out.println("Username is: " + Name);  // Output 
  }
}
