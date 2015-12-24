/*
You are to write a function called unique that takes an array of integers and returns the array with duplicates removed. It must return the values in the same order as first seen in the given array. Thus no sorting should be done, if 52 appears before 10 in the given array then it should also be that 52 appears before 10 in the returned array.
*/
//import Arrays and ArrayList
import java.util.Arrays;
import java.util.ArrayList;
//define a RemoveDuplicates class
public class RemoveDuplicates{
	//define unique method that takes in 1 int array as parameer
	public static int[] unique(int[] arr){
		//create an array list object
		ArrayList<Integer> alreadyPresent = new ArrayList<Integer>();
		//iterate through elements using a for loop
		for (int i = 0; i < arr.length; i++) {
			//if our array list does not contain the incoming element. This prevents the addition of a duplicate
			if (!alreadyPresent.contains(arr[i])){
				//if the element is not a duplicate, add it to our alreadyPresent ArrayList
				alreadyPresent.add(arr[i]);
			}
		}
		//create an empty int array that is the same size as modified array list
		int[] emptylist = new int[alreadyPresent.size()];
		//lets now fill our empty integer array using a for loop
		for (int i = 0; i < alreadyPresent.size(); i++){
			emptylist[i] = alreadyPresent.get(i);
		}
		return emptylist;
	}
	//define a main method for the RemoveDuplicates class
	public static void main(String[] args){
		//create a integer array
		int[] a = {1, 3, 5, 3, 1, 9, 4, 4};
		int[] returned = unique(a);
		//lets now print the returned integer array
		System.out.println(Arrays.toString(returned));
	}
}
