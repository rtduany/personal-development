/* deckSteve and deckJosh are arrays representing their decks. They are filled with "cards", represented by a single character. The card rank is as follows (from lowest to highest):

'2','3','4','5','6','7','8','9','T','J','Q','K','A'
Every card may appear in the deck more than once. Figure out who is going to win and return who wins and with what score:	*/
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Game {
	public String winner(String[] deckSteve, String[] deckJosh) {
		// make a dictionary using a HashMap
		HashMap<String, String> myPair = new HashMap<String, String>();
		//Adding elements to HashMap
		myPair.put("2", "Two");
		myPair.put("3", "Three");
		myPair.put("4", "Four");
		myPair.put("5", "Five");
		myPair.put("6", "Six");
		myPair.put("7", "Seven");
		myPair.put("8", "Eight");
		myPair.put("9", "Nine");
		myPair.put("10", "T");
		myPair.put("11", "J");
		myPair.put("12", "Q");
		myPair.put("13", "K");
		myPair.put("14", "A");

		//iterate through both decks
		int pointsSteve = 0;
		int pointsJosh = 0;
		//convert the incoming string to int
		int sKey = Integer.parseInt((String) getKey(myPair, deckSteve[0]));
		int jKey = Integer.parseInt((String) getKey(myPair, deckJosh[0]));

		if (sKey > jKey){
			pointsSteve++;
		}
		else if (sKey < jKey) {
			pointsJosh++;
		}
		else{
			System.out.println("Else block!");
		}

		for (int i = 1; i < deckSteve.length; i++){
			int intSteve = Integer.parseInt(deckSteve[i]);
			int intJosh = Integer.parseInt(deckJosh[i]);
			if (intSteve > intJosh){
				pointsSteve++;
			}else if (intSteve < intJosh){
				pointsJosh++;
			}else{
			System.out.println("Second Else block!");
			}
		}
		//default winner is "Tie"
		String winner = "";
		if (pointsSteve > pointsJosh){
			winner = "Steve wins "+pointsSteve+" to "+pointsJosh;
		}else if (pointsJosh < pointsSteve){
			winner = "Josh wins "+pointsJosh+" to "+pointsSteve;
		}else {
			winner = "Tie";
		}
		return winner;
	}


}
