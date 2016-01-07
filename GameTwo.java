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

}
