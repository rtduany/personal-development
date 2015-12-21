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
		return Arrays.toString(emptylist);
	}
	//define a main method for the removeDuplicates class
	public static void main(String[] args){
		int[] a = {1, 3, 5, 3, 1, 9, 4};
		System.out.println(a);
	}
}
