package Chapter7;

public class IntArray2D {

	public static void main(String[] args) {
		int [][] array1 = {{1, 2 , 3},{4, 5, 6}};
		int [][] array2 = {{1, 2 ,3}, {4 , 5, 6}, {7, 8, 9}};
		System.out.println("value in array1 row");
		outputArray(array1);
		System.out.println("value of array2 row");
		outputArray(array2);
		// TODO Auto-generated method stub
		}
	public static void outputArray(int[][] array) {
		for(int row = 0; row < array.length; row++) {
		
		for(int column = 0 ; column < array[row].length; column++)
			System.out.printf("%d ", array[row][column]);
		           System.out.println();
		
		}
	}

}
