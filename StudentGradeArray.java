package Chapter7;

public class StudentGradeArray {
	private String courseName;
	private int [][] grades;

	public StudentGradeArray(String courseName,int [][] grades) {
		this.courseName = courseName;
		this.grades = grades;
	  }
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void processGrade() {
		outputGrades();
		//System.out.printf("%nClass average is %.2f%n", getAverage());
		// call methods getMinimum and getMaximum
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
				getMinimum(), getMaximum());
		// call outputBarChart to print grade distribution chart
				outputBarchart();
	}
	//GETTER METHOD FOR GRADES AND OTHER OPERATIONS
		// PERFORM VARIOUS OPERATIONS ON DATA  
		//find minimum grade
	public int getMinimum() {
		int lowGrade = grades[0][0];// assume grades[0] is smallest
		//loop through grades array
		for(int [] studentGrade : grades) {
			for(int grade : studentGrade  ) {
	        // if grade lower than lowGrade, assign it to lowGrade
			if (grade < lowGrade)
				lowGrade = grade;// new lowest grade
		   }
		}
		    return lowGrade;
	}
	public int getMaximum() {
		int highGrade = grades[0][0];// assume grades[0] is largest
		//loop through grades array
		for(int [] studentGrade : grades) {
			for(int grade : studentGrade) {
	        // if grade higher than highGrade, assign it to lowGrade
			if (grade > highGrade)
				highGrade = grade;// new highest grade
		   }
		}
		    return highGrade;
	}
	public double getAverage(int [] setOfGrades) {
		int total = 0;
		// sum grades for one student
		for(int grade : setOfGrades)
			total += grade;
		//return average of grades
		return (double)total / setOfGrades.length;
	}
	         //output bar chart displaying grade distribution
	         //GETTER METHOD FOR bar chart
	public void outputBarchart() {
		System.out.println(" Overall grade distribution:");
		 // stores frequency of grades in each range of 10 grades
		int [] frequency = new int  [11];
		// for each grade, increment the appropriate frequency
		for(int [] studentGrade : grades) {
			for (int grade : studentGrade) {
			++frequency [grade / 10];
			}
		   // for each grade frequency, print bar in chart
		for (int count = 0; count < frequency.length; count++) {
			 // output bar label ("00-09: ", ..., "90-99: ", "100: ")
			if(count == 10)
				System.out.printf("%5d:", 100);
			else
				System.out.printf("%02d-%02d:", count * 10, count * 10 + 9);
			 // print bar of asterisks
			for(int stars = 0; stars < frequency[count]; stars++) 
				System.out.print("*");
				System.out.println();
		}
	}
			
}
	  // output the contents of the grades array
	     public void outputGrades() {
	    	 System.out.printf("the grades are %n%n");
	    	 System.out.printf("           ");
	    	 for(int test = 0; test < grades[0].length; test++)
	    	 System.out.printf("test %d: ", test + 1);
	    	 
	    	 // output each student's grades
	    	 for(int students = 0; students < grades.length; students++) {
	    	System.out.printf("student %d%n", students + 1);
	    	for(int test : grades[students])
	    		 System.out.printf(" %12d: ", test);
	    	
	    	double average = getAverage(grades[students]);
	    	 System.out.println(average);
	    	System.out.printf("%.2f%n: ", average);
	    }
	    	 
	}
}
	


