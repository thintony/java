package Chapter7;
public class InitArrayComLinArgs {
   public static void main(String [] args) {
		//Check number of command-line arguments 
		args = new String[3];
	    args[0] = "7";
	    args[1] = "4";
	    args[2] = "8";
	    
		if(args.length != 3)
			System.out.printf("Error: please re-enter the entire command, including%n"
				+ "an array usingsize, initial value and increment.%n");
		else {
			//get array size from first command line argument
			int arraylength = Integer.parseInt(args [0]);
			int [] array = new int[arraylength];
			//get initial value and increment from command line argument
			int initialvalue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			//calculate value for each array element
			for(int counter = 0; counter < array.length; counter++)
				array[counter] = initialvalue + increment * counter;
				System.out.printf("%s%18s%n", "INDEX", "VALUE");
			
			//display array index and value
			for(int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%18d%n", counter, array[counter]);
		}
    }
}
