/* In her trip to Italy, Elizabeth Gilbert made it her duty to eat perfect pizza. One day, she ordered one for dinner. And then some Italian friends appeared at her room.

The problem is that there were many people who ask for a piece of pizza at that moment. And she had a knife that only cuts straight.

Given a number K (K<=45000), help her get the maximum of pieces possible (not necessarily of equal size) with K cuts. If K is a negative number, the result must be -1 (or Nothing in Haskell).
*/
//second solution using an equation derived from Algebra, specifically from the general quadratic equation (y = .5x^2 + .5x + 1)
public class PizzaTwo{
	public static int maxPizza(int cut){
		int result = 0;
		//if cut is negative, result is -1
		if (cut < 0){ result = -1; }
		//if cut is greater than zero and if cut <= 45000, result is derived using the formula y = .5x^2 + .5x + 1
		if (cut >= 0 && cut <= 45000){ result = (int) ((0.5 * cut * cut) + (0.5 * cut) + 1); }
		return result;
	}
	public static void main(String[] args){
		System.out.println(maxPizza(-1));
		System.out.println(maxPizza(0));
		System.out.println(maxPizza(1));
		System.out.println(maxPizza(3));
	}
}
