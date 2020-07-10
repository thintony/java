package Chapter7;
//Received unspecified number of argument
public class VariLenArgList {
	public static double average (double...numbers) {
		double total = 0.0;
		for(double d : numbers)
			total += d;
		  return total / numbers.length;
		}

	   public static void main(String[] args) {
		   double d1 = 10.0;
		   double d2 = 20.0;
		   double d3 = 30.0;
		   double d4 = 40.0;
		   double d5 = 90.0;
		   System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%nd5 = %.1f",
				   d1, d2, d3, d4, d5);
		   System.out.println();
		   System.out.println();
		   System.out.printf("Average of d1 and d2 is %.1f",average
				   (d1, d2));
		   System.out.println();
		   System.out.println();
		   System.out.printf("Average of d1 , d2 and d3 is %.1f",average
				   (d1, d2, d3));
		   System.out.println();
		   System.out.println();
		   System.out.printf("Average of d1 , d2 , d3 , d4 and d5 is %.1f",average
				   (d1, d2, d3, d4, d5));
		   System.out.println();
		   System.out.println();
		   System.out.printf("Average of d1 ,  d3 and d5 is %.1f",average
				   (d1,  d3, d5));
		   
		// TODO Auto-generated method stub

	}

}
 