//import java.util.*;
public class UniqueArray {
	public static int[] unique(int[] arr) {
		int end = arr.length();
		for (int i = 0; i < end; i++){
			for (int j = i + 1; j < end; j++){
				if (arr[i] == arr[j]){
					arr[j] = arr[end - 1];
					end--;
					j--;
				}
			}
		}
		int[] emptyList = new int[end];
		System.arraycopy(arr, 0, emptyList, 0, end);
		return emptyList;
  }

  }
