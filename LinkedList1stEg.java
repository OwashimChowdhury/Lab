package collection;
/*
 * @author owashim chowdhury
 */
import java.util.LinkedList;

public class LinkedList1stEg {

	public static void main(String[] args) {
		//creating an linked list
		LinkedList<String> arr=new LinkedList<String>();
		//adding values
		arr.add("owashim");
		arr.add("rahul");
		arr.add("virat");
		arr.add("msd");
		//adding element to first position
		arr.addFirst("First");
		System.out.println("after adding:");
		System.out.println(arr);//print array list

	}

}
