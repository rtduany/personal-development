import java.util.ArrayList;
public class AreSame{
	//define a boolean comp() method that takes in 2 int array parameters
	public static boolean comp(int[] a, int[] b){
		//if int array a or b is null, return false
		if (a == null || b == null) { return false; }
		//create an Integer ArrayList and call it elements to utilize in processing the 2 arrays
		ArrayList<Integer> elements = new ArrayList<Integer>();
		//populate elements array list with the squares of int array a
		for (int elementA : a) {
			elements.add(elementA * elementA);
		}
		//compare the squares inside elements with incoming int array b elements and return false if any does not occur
		for (int elementB : b) {
			if (!elements.contains(elementB)) {
				return false;
			}
		}
		//otherwise, return true
		return true;
	}
	public static void main(String[] args){
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(comp(a, b));
	}
}
