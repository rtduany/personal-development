/* In her trip to Italy, Elizabeth Gilbert made it her duty to eat perfect pizza. One day, she ordered one for dinner. And then some Italian friends appeared at her room.

The problem is that there were many people who ask for a piece of pizza at that moment. And she had a knife that only cuts straight.

Given a number K (K<=45000), help her get the maximum of pieces possible (not necessarily of equal size) with K cuts. If K is a negative number, the result must be -1 (or Nothing in Haskell).
*/
//solve the problem using Trigonometry, specifically using a formula (y= x(x+1)/2 + 1) which is a variation on the equation for triangular //numbers which is n(n+1)/2;
public class Pizza{
	//define maxPizza method that takes in 1 parameter
	public static int maxPizza(int cut){
		int result = 0;
		//If cut is a negative number, the result must be -1
		if (cut < 0){ result = -1; }
		//if cut is greater than zero and if cut <= 45000
		if (cut >= 0 && cut <= 45000){ result = ((cut * (cut + 1) / 2) + 1); }
		return result;
	}
	public static void main(String[] args){
		System.out.println(maxPizza(-1));
		System.out.println(maxPizza(1));
		System.out.println(maxPizza(2));
		System.out.println(maxPizza(3));
	}
}
