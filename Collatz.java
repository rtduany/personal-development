/* The Collatz Conjecture states that for any natural number n, if n is even, divide it by 2. If n is odd, multiply it by 3 and add 1. If you repeat the process continously for n, n will eventually reach 1.
For example, if n = 20, the resulting sequence will be:
[20, 10, 5, 16, 8, 4, 2, 1]
Write a program that will output the length of the Collatz Conjecture for any given n. In the example above, the output would be 8.
*/
import java.util.ArrayList;
public class Collatz{
	public static long conjecture(long x) {
		long temp = x;
		//ensure that returned default value is 1
		long length = 1;
		while (temp > 1) {
			if (temp % 2 == 0){
				length++;
				temp = temp / 2;
			}else{
				length++;
				temp = 3 * temp + 1;
			}
		}
		return length;
	}
	public static void main(String[] args){
		long n = 20;
		System.out.println(conjecture(n));
	}
}
