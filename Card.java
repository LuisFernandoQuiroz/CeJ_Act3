package act3_CeJ_FernandoQuiroz;

public class Card {
	String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] palo = {"Picas","Treboles","Diamantes","Corazones"};
	String[] color = {"Negro","Rojo"};
	String[][] completeCard = new String[52][3];
	int place = 0;
	
	public String[][] getCardArray() {
		for (int setValor = 0; setValor < 52; setValor++) {
			completeCard[setValor][place] = valor[setValor%13];
			//System.out.println(completeCard[setValor][place]);
		}
		
		for (int setPalo = 0; setPalo < 52; setPalo++) {
			completeCard[setPalo][place + 1] = palo[setPalo/13];
			//System.out.println(completeCard[setPalo][place + 1]);
		}
		
		for (int setColor = 0; setColor < 52; setColor++) {
			completeCard[setColor][place + 2] = color[setColor/26];
			//System.out.println(completeCard[setColor][place + 2]);
		}
		//System.out.println(completeCard[26][0] + completeCard[26][1] + completeCard[26][2]);
		
		return completeCard;
	}
}