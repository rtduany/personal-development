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
	public static String reverseString(String input){
		StringBuilder sb = new StringBuilder();
		for (int i = input.length()-1; i >= 0; i--){
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args){
		String string1 = "012345";
		System.out.println(reverse(string1));
	}
}
