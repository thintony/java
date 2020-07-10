package Chapter7;

public class ArrayCount {

	public static void main(String[] args) {

		//int [] arrayFrequency = {95, 87, 97, 67, 86};
		int [] array = {3, 1, 7, 2, 5 };
	
		for(int counter = 0; counter < array.length; counter++) {
			for(int ray = 0; ray < array[counter]; ray++) {
				System.out.print("*");
			}
			     System.out.println();
		}

	}
}

