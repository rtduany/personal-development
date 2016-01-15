/* In this kata, you must create a digital root function. A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has two digits, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers. Here's how it works (Ruby example given):
digital_root(16)
=> 1 + 6
=> 7
*/
import java.util.ArrayList;
public class DRoot{
	//define a digital_root() method that takes in 1 parameter
	public static int digital_root(int n){
		int sum = 0;
		if (n > 0){
			//create an arra list
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			//populate the array with the digits of int n
			do{ arraylist.add(n % 10); n /= 10;
			}while (n > 0);
			//get the sum of digits in the array using foreach loop
			for(int i : arraylist){
				sum += i;
			}
		}
		//get the length of the array
		int length = String.valueOf(sum).length();
		//check if the length of the sum is more 1 digit
		if (length > 1){ return digital_root(sum); }

		return sum;
	}
	public static void main(String[] args){
		System.out.println(digital_root(493193));
	}
}
