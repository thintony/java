package Chapter7;
//Card is a Type
public class DeckOfCardsTest {
	// execute application
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();//place Card in random order
		//print all 52 cards in the order in which they are dealt
		for(int i = 1; i <= 52; i++) {
			//deal and display a card
			System.out.printf("%-19s",myDeckOfCards.dealCard());
			if(i % 4 == 0)
				System.out.println();
		}
		// TODO Auto-generated method stub
		

	}

}//end class DeckOfCardsTest
