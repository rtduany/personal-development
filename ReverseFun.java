public class ReverseFun {
	public static String reverse(String input){
		StringBuilder sb = new StringBuilder();
		int length = input.length();
		for (int i = 0; i < length; i++){
			int j = i;
			while (j < length){
				j++;
			}
			sb.append(reverseString(input.substring(i, j)));
			i = j - 1;
		}
		return sb.toString();
	}

}
