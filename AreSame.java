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

}
