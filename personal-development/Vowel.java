//define a Vowel.java class
class Vowel{
	//lets define a static void vowelToIndex method that takes in 1 string parameter
	static void vowelToIndex(String s){
		//instantiate a StringBuilder object named res to append character objects
		StringBuilder res = new StringBuilder();
		//define a string array that holds a list of characters after the string is split with empty spaces
		String[] words = s.split(" +");
		//lets now iterate through our split string using a for loop
		for (String word : words){
			/*we skip the first char
			res.append(word.charAt(0)); */
			//if character is a vowel, replace it with the corresponding number at the current index
			for (int i = 0; i < word.length(); i++){
				//assign the character at the current index to character variable named ch
				char ch = word.charAt(i);
				//if the current character being iterated thru is a vowel, append the index to res
				if (isVowel(ch)){
					res.append(i);
				}
				else{
					res.append(ch);
				}
			}
			res.append(' ');
		}
		//do some printing
		System.out.println(res);
	}
	//define a static boolean isVowel method to validate whether a char is a vowel
	static boolean isVowel(char ch){
		//first, lets make it case-insensitive
		ch=Character.toLowerCase(ch);
		return ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u';
	}

	//lets now define a main method to test our program
	public static void main(String[] args){
		vowelToIndex("allow me to ask you a question!");
	}
}
