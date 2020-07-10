package Chapter7;

public class IntContArray {

	public static void main(String[] args) {
		int [] array = new int[10];
		System.out.printf("%s%8s%n", "INDEX", "VALUE");
		        //int value = 0; array[counter]= 0;
		for(int counter = 0; counter < array.length; counter++) {
		     if(counter == 7 || counter == 9 ) 
		    	continue;
			System.out.printf("%3d%8d%n", counter , array[counter]);
			//if(counter%5==0)
			System.out.println();
		}
	

	}

}
