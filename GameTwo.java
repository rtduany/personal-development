//define a GameTwo class
public class GameTwo{
	//declare and initialize some fields
	private int pointsSteve = 0;
	private int pointsJosh = 0;
	//declare and initialize the card rank array called rank
	private final String[] rank = new String[]{"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
	//define a winner method that takes in 2 char arrays as parameters
	public String winner(String[] deckSteve, String[] deckJosh){
		if (deckSteve != null && deckSteve.length > 0 && deckJosh != null
        && deckJosh.length == deckSteve.length){
			for (int i = 0; i < rank.length; i++){
				if(getIndex(rank, deckSteve[i]) > getIndex(rank, deckJosh[i])){ pointsSteve++; }
				if(getIndex(rank, deckSteve[i]) < getIndex(rank, deckJosh[i])){ pointsJosh++; }
			}
		}
		return getWinner(pointsSteve, pointsJosh);
	}
	//define a getWinner helper method to return the winner based on points
	public String getWinner(int ptsS, int ptsJ){
		//default winner is "Tie"
		String winner = "Tie";
		if (pointsSteve > pointsJosh){ winner = "Steve wins " + pointsSteve +" to "+pointsJosh; }
		if (pointsSteve < pointsJosh){ winner = "Josh wins " + pointsJosh +" to "+pointsSteve; }
		return winner;
	}
	//define a getIndex helper method to return an int index for each element from the 2 decks
	public int getIndex(String[] rnk, String str){
		int ind = 0;
		for (int i = 0; i < rnk.length; i++){
			if (rnk[i] == str){ ind = i; }
		}
		return ind;
	}
	//define main method
	public static void main(String[] args){
		String[] deckSteve = new String[]{"A","7","8", "5", "T", "Q"};
		String[] deckJosh = new String[]{"K","5","9", "7", "J", "6"};
		Game game = new Game();
		System.out.println(game.winner(deckSteve, deckJosh));
	}
}
