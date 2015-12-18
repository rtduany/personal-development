import java.util.*;
//declare the ArrayListExamples.java class
public class ArrayListExamples{
	//define the main method for our ArrayListExamples.java class
	public static void main(Sring[] args){
		//create an empty String array list
		ArrayList<String> list = new ArrayList<String>();

		//add items to the list
		list.add("item1");
		list.add("item2");
		list.add("item3");
		//add item4 to the fourth position of the list
		list.add(3, "item4");

		//lets now display the contents of the array list
		System.out.println("The array list contains the following elements: "+list);
		//lets check the index of an item
		int pos = list.indexOf("item2");
		System.out.println("The index of item2 is: "+pos);
		//lets now check if the array list is empty
		boolean check = list.isEmpty();
		System.out.println("Checking if the array list is empty: "+check);
		//get the size of the list
		int size = list.size();
		System.out.println("The size of the array list is: " + size);
		//check if an element is included in the list
		boolean element = list.contains("item5");
		System.out.println("Checking if the array list contains item5: " + element);
		//get element at a specified position
		String item = list.get(0);
		System.out.println("The element at position or index one is: " + item);
		//retrieve elements from array list
		//first way: loop using index and size of list
		System.out.println("Retrieve elements by looping through using index and size list: ");
		for (int i = 0; i < list.length; i++){
			System.out.println("index: " + i + "- item: " + list.get(i));
		}

	}
}
