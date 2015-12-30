/*
You have to create a method "compoundArray" which should take as input two int arrays of different length and return one int array with numbers of both arrays shuffled one by one. Example: Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
*/
/*
Declare the c array with a length equal to the sum of the lengths of the two arrays. Then use System.arraycopy to copy the contents of the original arrays into the new array, being careful to copy them into the destination array at the correct start index. I would use an arraylist since the size is not permanent.
*/
import java.util.Arrays;
import java.util.ArrayList;
public class CompoundArray{
	public static int[] compoundArray(int[] a, int[] b){
		//Who Dares wins!
		//declare cArray array list
		ArrayList<Integer> cArray = new ArrayList<Integer>();
		int j = 0;
		int k = 0;
		int len = a.length + b.length;
		for (int i = 0; i < len; i++){
			//two incoming arrays are the same length
			if (j < a.length && k < b.length){
				cArray.add(a[j++]);
				cArray.add(b[k++]);
				i++;
			//if array a ends first
			}else if (j >= a.length && k < b.length){
				cArray.add(b[k++]);
			//if array b ends first
			}else if (j < a.length && k >= b.length){
				cArray.add(a[j++]);
			}else{
				System.out.println("There is an error!");
			}
		}
		//create an empty int[] with same size as cArray (array list)
		int[] lastArray = new int[cArray.size()];
		//populate cArray array list using a for loop
		for (int i = 0; i < cArray.size(); i++){
			lastArray[i] = cArray.get(i);
		}

		return lastArray;
	}
	public static void main(String[] args){
		int[] a = new int[]{0,1,2};
		int[] b = new int[]{9,8,7,6,5,4,3,2,1,0};
		int[] returned = compoundArray(a, b);
		System.out.println("The new shuffled array is: " + Arrays.toString(returned));
	}
}
