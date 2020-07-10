package Chapter7;


public class StudentSurvey {

	public static void main(String[] args) {
		int [] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 2, 3, 2, 3, 3, 3 };
		
           int [] frequency = new int [6]; 
//for each answer, select responses	element	and	use	that value
//	as	frequency	index	to	determine	element
           for(int answer = 0; answer <= responses.length; answer++) { 
        	  try {
			     ++ frequency  [responses[answer]];
				 }
        	  catch (ArrayIndexOutOfBoundsException e ) {
			 System.out.printf("%s%16s%16s%n", "RATING", "FREQUENCY","CUM FREQ");
			
		//	output	each	array	element's	value
		int total =0;
		int value = 0;
		for(int rating = 0; rating < frequency.length; rating++) {
			value = value + frequency[rating] ;
			System.out.printf("%2d  %14d%17d%n", rating,frequency[rating], value);
			total = frequency[rating] + total;
		}
		    System.out.println();
			System.out.println(total);
		    System.out.print(e);
		// TODO Auto-generated method stub
           
                 }
	
          }
     }
}