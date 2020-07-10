package Chapter7;

import java.lang.reflect.Array;

public class BarChartArray {

	public static void main(String[] args) {
		int [] arraygrouping = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int [] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		System.out.printf("%s%12s%n", "GRADE INTERVAL:","FREQUENCY:");
		
		for(int counter = 0; counter < array.length; counter++) {
			//	output	bar	label	("00-09:	",	…,	"90-99, 100)
			if(counter == 11) {
				System.out.printf("%5d: ");
			}
			else
			{ 
				System.out.printf("%n%03d - %03d:%13d ", counter * 10,counter * 10 + 9, array[counter]);
			
				}
			for(int star = 0; star < array[counter]; star++) {
				System.out.print("*");
			}
			System.out.println();
		          }
		// TODO Auto-generated method stub
		   }

	        // private static void counter(int i, int j) {
		// TODO Auto-generated method stub
	}


