/* The goal of this exercise is to write a method that takes two strings as parameters and returns an integer n, where n is equal to the amount of spaces "rotated forward" the second string is relative to the first string (more precisely, to the first character of the first string).
For instance, take the strings "fatigue" and "tiguefa". In this case, the first string has been rotated 5 characters forward to produce the second string, so 5 would be returned.
If the second string isn't a valid rotation of the first string, the method returns -1.
*/
public class CalculateRotation {
	static int shiftedDiff(String first, String second){
		//default value is 0 where the first and second string are the same
		int rotations = 0;
		int j = 0;
		//check if they are same length with valid rotation
		if (isRotation(first, second)){
			for (int i = 0; i < second.length(); i++){
				if (second.charAt(i) == first.charAt(0)){
					rotations = i;
					break;
				}
			}
		} else { rotations = -1; }
		return rotations;
	}
	//define a isRotation helper method to check if first string is a valid rotation of the second string
	static boolean isRotation(String s1,String s2) {
		return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}

}
