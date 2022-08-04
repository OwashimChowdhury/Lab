package exception;
//@author Owashim Chowdhury

import java.util.*;

public class TryCatchLab {

    public static void main(String[] args) {
        for(int i=1;i>0;i++) {

        try {
        	//taking input from user
            Scanner sc = new Scanner(System.in);
            System.out.print("enter input1:");
            int X = sc.nextInt();
            System.out.print("enter input2:");
            int  Y= sc.nextInt();
            int result = X/Y;//give the result
            System.out.println(result);
        }
        catch(InputMismatchException e){//InputMismatchException exception
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e)//catch the exception
        {
            System.out.println(e);//print exception
        }}
    }
}
