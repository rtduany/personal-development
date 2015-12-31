import java.util.ArrayList;
import java.util.List;
public class AreSame{
	public static boolean comp(int[] a, int[] b){
		if (a == null || b == null) {
                return false;
            }
            ArrayList<Integer> elements = new ArrayList<>();
            for (int elementA : a) {
                elements.add(elementA * elementA);
            }
            for (int elementB : b) {
                if (!elements.contains(elementB)) {
                    return false;
                }
            }
            return true;
	}
	public static void main(String[] args){
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(comp(a, b));
	}

}
