import java.util.Arrays;
public class MergeSort{
	//declare 3 fields (instance variables)
	private int[] array;
	private int[] tempMergeSortArr;
	private int length;
	//define a sort() method that takes in the incoming array to be sorted as a parameter
	public void sort(int[] inputArray){
		//assign the incoming inputArray equal to our instance int array array
		this.array = inputArray;
		//assign the length of the incoming array or inputArray equal to our instance variable length
		this.length = inputArray.length;
		//lets make a new int array that is equal in length to the inputArray and assign it to our tempMergeSortArr
		tempMergeSortArr = new int[length];
		doMergeSort(0, length -1);
	}
	//define a doMergeSort() method that takes in 2 incoming parameters (lowerIndex and higherIndex)
	private void doMergeSort(int lowerIndex, int higherIndex){
		//if lowerIndex is less than higherIndex, create a middle int index and do the sorting
		if (lowerIndex < higherIndex){
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			//sort the left side of the array recursively
			doMergeSort(lowerIndex, middle);
			//sort the right side of the array recursively
			doMergeSort(middle + 1, higherIndex);
			//now merge both parts
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

}
