/* Create a method named "rotate" that returns a given array with the elements inside the array rotated n spaces.
If n is greater than 0 it should rotate the array to the right. If n is less than 0 it should rotate the array to the left. If n is 0, then it should return the array unchanged.
Example:
Object[] data = new Object[]{1, 2, 3, 4, 5};
rotate(data, 1)    =>    {5, 1, 2, 3, 4}
rotate(data, 2)    =>    {4, 5, 1, 2, 3}
rotate(data, 3)    =>    {3, 4, 5, 1, 2}
rotate(data, 4)    =>    {2, 3, 4, 5, 1}
rotate(data, 5)    =>    {1, 2, 3, 4, 5}
*/
import java.util.Arrays;
import java.lang.Math.*;
public class Rotator{
	//declare some fields
	private int[] array;
	private int[] result;
	private int length;
	public int[] rotate(int[] data, int n){
		this.array = data;
		this.length = data.length;
		this.result = new int[length];
		//if n is greater than length, use mod and assign remainder to n
		if (n > length){ n = n % length; }
		//if n equals 0, return the array as is
		if (n == 0){ for (int i = 0; i < length; i++){ result[i] = array[i]; } }
		//if n is greater than 0, use doRotate() helper method to rotate the array
		if (n > 0){ result = doRotate(length, n); }
		//if n is negative, use negativeOrder() helper method to rotate the array
		if (n < 0){ result = negativeOrder(length, n); }
		return result;
	}

}
