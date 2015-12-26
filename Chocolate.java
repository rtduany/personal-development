//lets define a class called Chocolate
public class Chocolate{
	//define a breakChocolate method that takes in 2 parameters as integers
	public static int breakChocolate(int n, int m){
		//declare an integer minBreaks and set it equal to zero
		int minBreaks = 0;
		//if n and m are not zero, calculate the minBreaks
		if (n != 0 && m != 0){
			minBreaks = (n * m) - 1;
		}
		return minBreaks;
	}
	//define a main method to test our Chocolate class
	public static void main(String[] args){
		System.out.println("The minimum of breaks are: " + breakChocolate(5, 5));
	}
}
