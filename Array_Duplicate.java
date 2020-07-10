package Chapter7;
import java.util.Scanner;
public class Array_Duplicate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter number");
		int number = input.nextInt();
		int [] p = new int [5]; 
		int counter = 0;
		int ExistNum = 0;
	
		if(number >= 10 || number <= 100) {
		
		}
		else {
			System.out.println("enter a valid number: ");
	}
		for(counter = 0; counter < p.length; counter++) {
			System.out.print("enter number");
			number = input.nextInt();
			if(number >= 10 && number <= 100 ) {
				if(p[counter] != number) {
					p[counter] = number;
					 if(ExistNum == number) 
					   number = ExistNum;
					       continue;
				}
				else
				         break;
		}
		 else {
				
				System.out.println("enter a valid number: ");
			}
			  // if(number == number) {
				//   number = number;
				    // continue;
			  // }
		}	
		for(counter = 0; counter < p.length; counter++) {
			System.out.printf("%5d%8d%n", counter, p[counter]);
	}
  }
}
