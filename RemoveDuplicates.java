//import Arrays, ArrayList
import java.util.Arrays;
import java.util.ArrayList;
//define a RemoveDuplicates class
public class RemoveDuplicates{
	//define removeDuplicates method that takes in 1 int array as parameer
	public static String removeDuplicates(int[] arr){
		//create an array list object
		ArrayList<Integer> alreadyPresent = new ArrayList<Integer>();
		//iterate through elements using a for loop
		for (int i; i < arr.length; i++) {
			//if our array list does not contain the incoming element. This prevents the addition of a duplicate
			if (!alreadyPresent.contains(arr[i])){
				//if the element is not a duplicate, add it to our alreadyPresent ArrayList
				alreadyPresent.add(arr[i]);
			}
		}
	}

}
