// VOWEL COUNT
// LANGUAGE: JAVA

// Create a VowelCount class with a vowelCount method and a main method.
// The vowelCount method should contain the algorithm and the main method
// should be used for testing your algorithm.To make testing easier, make the vowelCount method static.
// Given an input of a String sentence, count the number of vowels that occur in the sentence.
// Return a HashMap object containing the vowels as keys and their counts as values.

// Example:
// HashMap vowelMap = VowelCount.vowelCount("mary had a little lamb");
// vowelMap.get('a'); // 4
// vowelMap.get('i'); // 1
// vowelMap.get('e'); // 1
// vowelMap.get('o'); // null
// HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
// vowelMap.get('o'); // 9
// vowelMap.get('i'); // 3
// vowelMap.get('e'); // 3
// vowelMap.get('u'); // 3

import java.util.HashMap;
//define a VowelCount.java
public class VowelCount{
	//define a vowelCount method for VowelCount class
	//that takes in 1 parameter
	static HashMap vowelCount(String userString){
		// Creating new HashMap objects
        // keys are String, values are Integer
		HashMap<Character, Integer> vowels = new HashMap<Character, Integer>() {
		{
			put('a', 0);
			put('e', 0);
			put('i', 0);
			put('o', 0);
			put('u', 0);
		}
	};
	for (int count = 0; count < userString.length(); count++)
{
    char ch = userString.charAt(count);
    ch = Character.toLowerCase(ch);

    if (vowels.containsKey(ch)) {
        vowels.put(ch, vowels.get(ch) + 1);
    }
}
		System.out.println(vowels);
		return vowels;
	}
	public static void main(String[] args){
		HashMap vowelMap = VowelCount.vowelCount("do we control our computers, or do they control us?");
		vowelMap.get('o');
	}
}
