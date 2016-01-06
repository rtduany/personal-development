/* Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
*/
import java.util.Arrays;
public class SortString{
	public static String sortString(String words){
		//If the input String is empty, return an empty String
		if (words == " "){ return " "; }
		//split the words string, by whitespace using a split method and a regex, into a word array called str
		String[] str = words.split("\\s+");
		//make an empty int array that is equal in length to the str string word array
		int [] myString = new int[str.length];
		//a for loop to iterate through str word array
		for(int x = 0; x < str.length; x++){
			//populate myString with the extracted digits from str string split. The helper method "digits" takes in the incoming words
			//and extracts the digits. The digits are then assigined to our empty String array "myString" to populate it
			myString[x] = digits(str[x]);
		}
		//sort our int array myString in an ascending fashion using Arrays.sort() method
		Arrays.sort(myString);
		//make an empty string array called lastArray that is equal in length to the myString int array
		String[] lastArray = new String[myString.length];
		//a for loop to iterate through the numbers in myString
		for (int i = 0; i < myString.length; i++){
			//a for loop to iterate through the words in str array
			for (int j = 0; j < str.length; j++){
				//extract digit from incoming word and compare the digit to the number from mYstring int array
				if (myString[i] == digits(str[j])){
					//if the two digits are equal, assign the corresponding incoming word "str[i]" to empty array lastArray
					lastArray[i] = str[j];
				}
			}
		}
		//return the string from helper method "backString". The backString helper method converts lastArray array to string
		return backString(lastArray);
	}
	//define a helper method to change lastArray to string, using StringBuilder, and return it
	public static String backString(String[] strArray){
		StringBuilder builder = new StringBuilder();
		for (String s : strArray){
			if (builder.length() > 0){ builder.append(" "); }
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
