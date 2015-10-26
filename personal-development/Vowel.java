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
			//we skip the first char
			res.append(word.charAt(0));
			//if character is a vowel, replace it with the corresponding number at the current index
			for (int i = 1; i < word.length(); i++){
				char ch = word.charAt(i);
			}
		}

	}
}
