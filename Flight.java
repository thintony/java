package Chapter7;

import java.util.Scanner;

public class Flight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean [] flight = new boolean [10];
		int firstClass = 0;
		int economy = 0;
		int seatCounter = 1;
		System.out.print("Enter result(1 = firstClass, 2 = economy)");
		int result = input.nextInt();
		while(seatCounter <= 10) {
		
		if(result == 1 ) {
			
			firstClass++;
		}
		else if(economy >= 6 && economy <= 10)
			{economy++;
				}
		seatCounter = seatCounter + 1;
		}
		//termination phase
		System.out.printf("FirstClass: is %d, Economy: is %d", firstClass, economy);
		
		if(firstClass >= 8) {System.out.print("Bonus to the teacher");
		}
		input.close();

	}

}
