/* Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
*/
import java.util.Arrays;
import java.util.ArrayList;
public class SortString{
	public static String sortString(String st){
		String[] str = st.split("\\s+");
		int [] myString = new int[str.length];
		for(int x = 0; x < str.length; x++){
			//populate myString with the extracted digits from str string split
			myString[x] = digits(str[x]);
		}
		//sort our int array myString
		Arrays.sort(myString);
		//for loop and re-arrange our original string array
		String[] lastArray = new String[myString.length];
		for (int i = 0; i < myString.length; i++){
			for (int j = 0; j < str.length; j++){
				if (myString[i] == digits(str[j])){
					lastArray[i] = str[j];
				}
			}
		}
		//change lastArray to string, using StringBuilder, and return it
		StringBuilder builder = new StringBuilder();
		for (String s : lastArray){
			if (builder.length() > 0){
				builder.append(" ");
			}
			builder.append(s);
		}
		return builder.toString();
	}

	//define a helper method to extract digits from incoming string words
	public static int digits(String s) {
		int d = 0;
		String digit = "";
		for (int j = 0; j < s.length(); j++) {
			char chrs = s.charAt(j);
			if (Character.isDigit(chrs)) {
				digit += chrs;
				d = Integer.parseInt(digit);
			}
		}
		return d;
	}
	public static void main(String[] args){
		String str1 = "is2 Thi1s T4est 3a";
		System.out.println(sortString(str1));
	}
}
