import java.util.ArrayList;
import java.util.List;
public class Rectangle {
	public static List<Integer> Rectangle(int lng, int wdth) {
		if (lng == wdth)
		return null;
		//declare an ArrayList to hold our result
		List<Integer> res = new ArrayList<Integer>();

		while (lng != 0 && wdth != 0) {
			if (lng > wdth) {
				res.add(wdth);
				lng = lng - wdth;
			} else {
				res.add(lng);
				wdth = wdth - lng;
			}
		}
		return res;
	}
	public static void main(String[] args){
		System.out.println("The returned list is: " + Rectangle(5, 3));
	}

}
