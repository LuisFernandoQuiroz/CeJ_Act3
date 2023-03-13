package act3_CeJ_FernandoQuiroz;

import java.util.*;
import java.util.Scanner;

public class Act3_Main {

	public static void main(String[] args) {
		boolean end = false;
		Scanner action = new Scanner(System.in);	
		
		Deck callDeck = new Deck();
		callDeck.settingDeck();
		
		while(end == false) {
			System.out.println("Que accion desea realizar?");
			System.out.println("1. Shuffle");
			System.out.println("2. Head");
			System.out.println("3. Pick");
			System.out.println("4. Hand");
			System.out.println("5. Fin");
			int actionInt = action.nextInt();
			
			switch (actionInt) {
			case 1:
				callDeck.shuffle();
				break;
			case 2:
				callDeck.head();
				break;
			case 3:
				callDeck.pick();
				break;
			case 4:
				callDeck.hand();
				break;
			case 5:
				end = true;
				break;
			default:
				System.out.println("Seleccione una de las acciones presentadas");
			}
			
		}
		
	}
}
