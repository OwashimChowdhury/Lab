package collection;
/*
 * @ author owashim chowdhury
 */
import java.util.ArrayList;

public class ComparearrayList {
	
	public static void main(String[] args) {
		//creating an array list
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("red");
		arr.add("green");
		arr.add("orange");
		arr.add("white");
		arr.add("black");
		//creating another array list
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("red");
		arr1.add("green");
		arr1.add("orange");
		arr1.add("black");
		
		//creating another array list
		 ArrayList<String> arr2 = new ArrayList<String>();
         for (String e : arr)//for each loop
            arr2.add(arr1.contains(e) ? "Yes" : "No");//checking all the elements matched or not
         System.out.println(arr2);//printing "yes" or "no" 
	}
}
