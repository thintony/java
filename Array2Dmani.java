package Chapter7;

public class Array2Dmani {

	public static final int column = 0;

	public static void main(String[] args) {
		int [][] array = {{0, 1, 2},{1, 2 ,3}, {4 , 5, 6}, {7, 8, 9,}};
		for(int column = 0; column < array[2].length; column++);
		array[1][0] = 0;
		//array[2][1] = 0;
		//array[2][2] = 0;
		//array[2][2] = 0;
		int total = 0;
		for(int row =0; row < array.length; row++) {
			for(int column = 0; column < array[row].length; column++);
			total = total + array[row][column];
			System.out.printf("%5d,%6d%n",array[row][column], total);
			System.out.println();
		}
		    System.out.printf("%d", total);

		// TODO Auto-generated method stub

	}

}
