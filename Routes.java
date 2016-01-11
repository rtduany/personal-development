/* Given a side length n, traveling only right and down how many ways are there to get from the top left corner to the bottom right corner of an n by n grid?
Your mission is to write a program to do just that!
Add code to route(n) that returns the number of routes for a grid n by n (if n is less than 1 return 0).
Examples:
-100 -> 0
1 -> 2
2 -> 6
20 -> 137846528820
*/
import java.math.BigInteger;
public class Routes {
	public static long routes(int n) {
        //if n is negative, return 0
		if (n < 0){ return 0; }
		//use BigInteger to calculate n factorial
        BigInteger nFact = BigInteger.ONE;
        for (int i=1; i<=n; i++) { nFact = nFact.multiply(BigInteger.valueOf(i)); }
		//add two dimensions of grid to get numerator
		BigInteger nFactDouble = BigInteger.ONE;
		int m = n + n;
		for (int i=1; i<=m; i++) { nFactDouble = nFactDouble.multiply(BigInteger.valueOf(i)); }
		//multiply the two dimensions of grid to get denominator
		BigInteger nFactMultiple = BigInteger.ONE;
		nFactMultiple = nFact.multiply(nFact);
		//the number of ways to get from top left corner to bottom right corner is
		BigInteger ways = BigInteger.ONE;
		ways = nFactDouble.divide(nFactMultiple);
		//convert to long data type
		long nWays;
		nWays = ways.longValue();
		return nWays;
	}

}
