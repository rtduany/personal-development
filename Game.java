/* deckSteve and deckJosh are arrays representing their decks. They are filled with "cards", represented by a single character. The card rank is as follows (from lowest to highest):
'2','3','4','5','6','7','8','9','T','J','Q','K','A'
Every card may appear in the deck more than once. Figure out who is going to win and return who wins and with what score:	*/
import java.util.HashMap;
import java.util.Map;

public class Game {

	public static int getInt(Object obj) {
		if (obj instanceof String) {
			return Integer.parseInt((String) obj);
		} else if(obj instanceof Integer){
			return (Integer) obj;
		} else{
			return 0; // or else whatever you want
		}
	}
	// hm is the map you are trying to get key from it
	public static int getKey(Map hm, String value) {
		int ob = 0;
		for (Object o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				ob = getInt(o);
			}
		}
		return ob;
	}
	public String winner(String[] deckSteve, String[] deckJosh) {
		// make a dictionary using a HashMap
		HashMap<Integer, String> myPair = new HashMap<Integer, String>();
		//Adding elements to HashMap
		myPair.put(2, "2");
		myPair.put(3, "3");
		myPair.put(4, "4");
		myPair.put(5, "5");
		myPair.put(6, "6");
		myPair.put(7, "7");
		myPair.put(8, "8");
		myPair.put(9, "9");
		myPair.put(10, "T");
		myPair.put(11, "J");
		myPair.put(12, "Q");
		myPair.put(13, "K");
		myPair.put(14, "A");

		//iterate through both decks
		int pointsSteve = 0;
		int pointsJosh = 0;
		for (int i = 0; i < deckSteve.length; i++){
			String c1 = deckSteve[i];
			String c2 = deckJosh[i];
			//use regex to check if the string contains numbers only
			if ((c1.matches("^[0-9]+$")) && (c2.matches("^[0-9]+$"))){
				if (getInt(deckSteve[i]) > getInt(deckJosh[i])){ pointsSteve++; }
				if (getInt(deckSteve[i]) < getInt(deckJosh[i])){ pointsJosh++; }
			}
			//use regex to check if the string contains upper case letters only
			if ((c1.matches("^[A-Z]+$")) && (c2.matches("^[A-Z]+$"))){
				if (getKey(myPair, deckSteve[i]) > getKey(myPair, deckJosh[i])){ pointsSteve++; }
				if (getKey(myPair, deckSteve[i]) < getKey(myPair, deckJosh[i])) { pointsJosh++; }
			}
			//If SteveDedk contains a letter but JoshDeck contains a number
			if ((c1.matches("^[A-Z]+$")) && (c2.matches("^[0-9]+$"))){
				if (getKey(myPair, deckSteve[i]) > getInt(deckJosh[i])){ pointsSteve++; }
				if (getKey(myPair, deckSteve[i]) < getInt(deckJosh[i])){ pointsJosh++; }
			}
			//If SteveDedk contains a number but JoshDeck contains a letter
			if ((c1.matches("^[0-9]+$")) && (c2.matches("^[A-Z]+$"))){
				if (getInt(deckSteve[i]) > getKey(myPair, deckJosh[i])){ pointsSteve++; }
				if (getInt(deckSteve[i]) < getKey(myPair, deckJosh[i])){ pointsJosh++; }
			}

		}
		//default winner is "Tie"
		String winner = "Tie";
		if (pointsSteve > pointsJosh){ winner = "Steve wins " + pointsSteve +" to "+pointsJosh; }
		if (pointsSteve < pointsJosh){ winner = "Josh wins " + pointsJosh +" to "+pointsSteve; }
		return winner;
	}

	public static void main(String[] args){
		String[] deckSteve = new String[]{"A", "7", "8"};
		String[] deckJosh = new String[]{"K", "5", "9"};
		Game game = new Game();
		System.out.println(game.winner(deckSteve, deckJosh));
	}
}
