package Chapter7;
import	java.security.SecureRandom;
public class Rolldie7 {

	public static void main(String[] args) {
		SecureRandom randomNumbers	= new SecureRandom();
		int [] frequency = new int[6];
		// TODO Auto-generated method stub
                  //Roll die 200,000
		for(int roll = 1; roll <= 200000; roll++) {
			
			
			
			 int currentValue= 1 + randomNumbers.nextInt(6);
			 
			 switch(currentValue) {
			 case 1:
				 frequency[0] = ++frequency[0];
				 break;
			 case 2:
				 frequency[1] = ++frequency[1] ;
				 break;
			 case 3:
				 frequency[2] = ++frequency[2] ;
				 break;
			 case 4:
				 frequency[3] = ++frequency[3];
				 break;
			 case 5:
				 frequency[4] = ++frequency[4];
				 break;
			 case 6:
				 frequency[5] = ++frequency[5];
				 break;
			 }
			 
			}
		System.out.printf("%s%16s%n", "FACE", "FREQUENCY");
		//	output	each	array	element's	value
		int total =0;
		for(int face = 0; face < frequency.length; face++) {
			System.out.printf("%2d  %14d%n",1 + face,frequency[face]);
			total = frequency[face] + total;
		}
		System.out.println(total);
	}

}
