package act3_CeJ_FernandoQuiroz;

import java.util.*;

public class Deck {
	LinkedList<Integer> numberOfCards = new LinkedList<Integer>();
	LinkedList<Integer> randomPick = new LinkedList<Integer>(); 
	Card card = new Card();
	String[][] gottenCards = card.getCardArray();
	int headCount = 0;
	int pickCount = 0;
	
	public void settingDeck() {
		for(int count = 0; count < 52; count++) {
			numberOfCards.add(count);
			randomPick.add(count);
		}
		
		Collections.shuffle(randomPick);
	}
	
	public void shuffle() {
		Collections.shuffle(numberOfCards);
		
		System.out.println("Se mezclo el deck");
		System.out.println("");
	}
	
	public void head() {
		numberOfCards.get(headCount);
		System.out.println(gottenCards[numberOfCards.get(headCount)][1] + " "
						 + gottenCards[numberOfCards.get(headCount)][2] + " "
						 + gottenCards[numberOfCards.get(headCount)][0]);
		headCount = headCount + 1;
		
		System.out.println("Quedan " + (52 - headCount));
		System.out.println("");
	}
	
	public void pick() {
		randomPick.get(pickCount);
		System.out.println(gottenCards[randomPick.get(pickCount)][1] + " "
						 + gottenCards[randomPick.get(pickCount)][2] + " "
						 + gottenCards[randomPick.get(pickCount)][0]);
		pickCount = pickCount + 1;
		
		System.out.println("Quedan " + (52 - pickCount));
		System.out.println("");
	}
	
	public void hand() {
		numberOfCards.get(headCount);
		
		for(int count = 0; count < 5; count++) {
			System.out.println(gottenCards[numberOfCards.get(headCount)][1] + " "
						 	 + gottenCards[numberOfCards.get(headCount)][2] + " "
						 	 + gottenCards[numberOfCards.get(headCount)][0]);
			headCount = headCount + 1;
		}
		
		System.out.println("Quedan " + (52 - headCount));
		System.out.println("");
	}
	
}