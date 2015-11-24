class XoXo {
	public static boolean compare(String text){
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < text.length(); i++){
			if (text.charAt(i) == 'x'){
				countX += 1;
			}
			else{
				countO += 1;
			}
		}
		return countX == countO;
	}
	public static void main(String[] args){
		System.out.println(compare("oxoxoxo"));
	}
}
