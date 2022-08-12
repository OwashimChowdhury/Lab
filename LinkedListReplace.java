package collection;
/*
 * @author owashim chowdhury
 */

import java.util.LinkedList;

public class LinkedListReplace {

	public static void main(String[] args) {
		//creating a linked list
		LinkedList<String> arr=new LinkedList<String>();
		//adding values
		arr.add("owashim");
		arr.add("rahul");
		arr.add("virat");
		arr.add("msd");
		arr.set(2, "sam");//replace 2position 
		System.out.println("after replacing:");
		System.out.println(arr);//print list
	}

}
