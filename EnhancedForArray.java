package Chapter7;

public class EnhancedForArray {

	public static void main(String[] args) {
		int [] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87
		};
	   /* int [] value = {
	    		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	    };*/
		int total = 0;
		for(int number : array  ) {
		total = total += number;
	    System.out.printf("%5d  %10d%n",  number, total );
	    System.out.println();
		}
	  }
}
