public class NotVisibleCubes {
	//define a notVisibleCubes method that takes in 1 parameter of type Long
	public Long notVisibleCubes(Long n) {
		int k = 3;
		Long inner = (n-2)*(n-2)*(n-2);
	return inner;
	}
	public static void main(String[] args){
		NotVisibleCubes nvc = new NotVisibleCubes();
		System.out.println("The invisible sides of the cube are: " + nvc.notVisibleCubes(6L));
	}
}
