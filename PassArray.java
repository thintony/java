package Chapter7;

public class PassArray {

	public static void main(String[] args) {
		int [] array = { 1, 2, 3, 4, 5 };
		System.out.printf("Effect of passing reference of entire array:%n"+
		"The value of the original array are:");
		//output original array elements
		for(int value : array) {
			System.out.printf("%d", value);
			
			modifyArray(array);//pass array reference
			System.out.printf("The value of the original array are:%n");
			
			//output modified array elements value to value1
			for(int value1 : array) {
				System.out.printf("  %d", value);
				System.out.printf("Effect of passing array element value:%n" +
				"array[3] after modifyElement:%d%n", array[3]);
				
				modifyElement(array [3]);//attempt to modify array[3]
				System.out.printf("array[3] after modifyElement: %d%n", array[3]);
			}
		}
	
	 }
	// multiply each element of an array by 2
	public static void modifyArray(int[] array) {
		for(int counter = 0; counter < array.length; counter++)
			array[counter] *= 2;
		// TODO Auto-generated method stub
		// multiply argument by 2
	}
	private static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement: %d%n", element);
		
	}
}
