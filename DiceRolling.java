package Chapter7;
import java.security.SecureRandom;
public class DiceRolling {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		 int die1 = 1 + randomNumbers.nextInt(6);
		 int die2 = 1 + randomNumbers.nextInt(6);
	      int rollDice = 0;
	      int sum = 0;
	      for(int counter = 1; counter <= 20; counter++) {
	    	  sum = die1 + die2;
	    	  System.out.printf("%d%n", sum);
	    }
	}
}