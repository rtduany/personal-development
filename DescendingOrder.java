/* Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order. Descending order means that you take the highest digit and place the next highest digit immediately after it.
Examples:
Input: 145263 Output: 654321
Input: 1254859723 Output: 9875543221 */

import java.util.Arrays;
import java.util.*;
public class DescendingOrder {
	public static int reverse(int number){
		//turn int to int[]
		String num = String.valueOf(number);
		int[] arr = new int[num.length()];
		int i = 0;
		do {
			arr[i] = number % 10;
			number /= 10;
			i++;
		} while (number != 0);

		//sort ascending
		Arrays.sort(arr);
		//reverse it
		revArray(arr);

		//convert int[] back to int
		StringBuilder strNum = new StringBuilder();
		for (int numb : arr) {
			strNum.append(numb);
		}
		int myInt = Integer.valueOf(strNum.toString());
		return myInt;
	}
	//a method to reverse the array
	public static String revArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while( left < right ) {
			// swap the values at the left and right indices
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			// move the left and right index pointers in toward the center
			left++;
			right--;
		}
		return Arrays.toString(arr);
	}


}
