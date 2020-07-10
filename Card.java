package Chapter7;
//Card is a Type
public class Card {
	private final String face;
	private final String suit;

	public Card(String face , String suit) {
		this.face = face;
		this.suit = suit;
		// TODO Auto-generated constructor stub
	  }
	public String toString() {
		return face +" of " + suit;
	}
}// end class Card
