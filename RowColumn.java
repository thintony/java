package Chapter7;

public class RowColumn {
							
	public static void main(String[] args) {
		       int a[][] = { {1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		       for(int row = 0; row < a.length;  row++) {
		    	   for(int column = 0; column < a[row].length;  column++) {
		    		  System.out.print(a[row][column]);
		    		    if( column % 5 == 0)
		    		    	System.out.println( );
		    	   }
		    	   
		       }

	}

}
