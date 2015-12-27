/*
Write a method alternate_sq_sum (JS: alternateSqSum ) that takes an array of Integers as Input and finds the sum of squares of the elements at even positions (i.e 2nd 4th 6th etc etc elements) and the rest of the elements at odd Position (i.e 1st 3rd etc elements) without squaring them (the odd ones) thus completing whole array.
Example:
alternateSqSum(new int[] {11, 12, 13, 14, 15}) // should return 379
*/
public class AlternateSqSum{
	public static int alternateSqSum(int[] arr) {
		int oddSum = 0;
		int evenSum = 0;
		int total = 0;
		for (int i = 1; i < arr.length+1; i++){
			if (i % 2 == 0)
				oddSum = oddSum + (arr[i-1]) * (arr[i-1]);
			if (i % 2 != 0)
				evenSum = evenSum + arr[i-1];
		}
		total = oddSum + evenSum;
		return total;
	}
	public static void main(String[] args){
		int[] arr = new int[] {10, 7, 15, 11, 12, 15, 6, 12, 15, 13, 9};
		System.out.println("The total is: " + alternateSqSum(arr));
	}
}
