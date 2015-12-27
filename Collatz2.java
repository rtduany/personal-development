//define Collatz2 class
public class Collatz2 {
	//define conjecture method that takes in 1 parameter
	public static long conjecture(long x) {
		//ensure that default value is 1
		long counter = 1;
		//while loop stopping at the value 1 exclusive
		while(x != 1){
			//compact condition statment accounting for the even and odd cases
			x = (x % 2 == 0) ? x/2: x*3+1;
			//increment every iteration
			++counter;
		}
		//return the number output the length of the Collatz Conjecture
		return counter;
	}
	//define a main method to test the program
	public static void main(String[] args){
		long n = 20;
		System.out.println(conjecture(n));
	}
}
