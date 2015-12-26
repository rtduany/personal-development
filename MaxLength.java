/* You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any string in the first array and y be any string in the second array.
Find max(abs(length(x) − length(y)))
If a1 or a2 are empty return -1 in each language except in Haskell where you will return Nothing.
Example:

s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(s1, s2) --> 13
*/
class MaxLength {
	public static int maxLength(String[] a1, String[] a2) {
        int maxDiff = -1;
		for (String x : a1){
			for (String y : a2){
				int max = Math.abs(x.length() - y.length());
				if (max > maxDiff){
					maxDiff = max;
				}
			}
		}
		return maxDiff;
	}
	public static void main(String[] args){
		String[] s1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
		String[] s2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
		System.out.println("The maximum difference is: " + maxLength(s1, s2));
	}
}
