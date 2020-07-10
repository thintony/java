package Chapter7;

public class ArrayInitializer {

	public static void main(String[] args) {
		int [] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		System.out.printf("%s%8s%8s%n", "INDEX", "VALUE", "TOTAL");
		       //int value = 0;
		int total =0;
		for(int counter = 0; counter < array.length; counter++) {
			total = total + array[counter];
			
			// value = array[counter];
			System.out.printf("%3d%8d%8d%n", counter , array[counter],total);
			//if(counter%5==0)
			System.out.println();
		}

	}

}