package Chapter7;

import java.security.SecureRandom;

public class RollDie73 {

	public static void main(String[] args) {
		SecureRandom randomNumbers	= new SecureRandom();
		int [] frequency = new int[7];
	             //Roll die 200,000
		for(int roll = 1; roll <= 200000; roll++) { 
			     ++ frequency [ 1 + randomNumbers.nextInt(6)];
		    }
			 System.out.printf("%s%16s%16s%n", "FACE", "FREQUENCY","CUM FREQ");
		//	output	each	array	element's	value
		int total =0;
		int value = 0;
		for(int face = 0; face < frequency.length; face++) {
			value = value + frequency[face] ;
			System.out.printf("%2d  %14d%17d%n", face,frequency[face], value);
			total = frequency[face] + total;
		}
		    System.out.println(total);
		// TODO Auto-generated method stub
		} 

}
