/*Each number should be formatted that only the first two decimal places are returned. You don't need to check whether the input is a valid number because only valid numbers are used in the tests.

Don't round the numbers! Just cut them after two decimal places!
*/
public class Numbers{
	public static double twoDecimalPlaces(double number){
		if (number < 0){
			return Math.ceil(number * 100) / 100;
		}else{
			return Math.floor(number * 100) / 100;
		}
	}
}
