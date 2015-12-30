/*
You have to create a method "compoundArray" which should take as input two int arrays of different length and return one int array with numbers of both arrays shuffled one by one. Example: Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
*/
import java.util.Arrays;
public class CompoundArray2{
	public static int[] compoundArray(int[] a, int[] b){
		//Who Dares wins!
		int[] cArray = new int[a.length + b.length];
		int index = 0;
		for (int i = 0; i < cArray.length; i++){
			if (i < a.length){
				cArray[index++] = a[i];
			}
			if (i < b.length){
				cArray[index++] = b[i];
			}
		}
		return cArray;
	}
	public static void main(String[] args){
		int[] a = new int[]{0,1,2};
		int[] b = new int[]{9,8,7,6,5,4,3,2,1,0};
		int[] returned = compoundArray(a, b);
		System.out.println("The new shuffled array is: " + Arrays.toString(returned));
	}
}
