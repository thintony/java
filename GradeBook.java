package Chapter7;
 // GradeBook class using an array to store test grades.
public class GradeBook {
	private String courseName;//name of course this GradeBook represents
	private int [] grades;//array of student grades
			//constructor
	public GradeBook(String courseName, int [] grades ) {
		this.courseName = courseName;
		this.grades = grades;
	}
	
	public GradeBook(String courseName2, int[][] gradesArray) {
		// TODO Auto-generated constructor stub
	}

	//SETTER METHOD
	public void setCourseName(String  courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	//SETTER METHOD FOR GRADES AND OTHER OPERATIONS
	// PERFORM VARIOUS OPERATIONS ON DATA
	public void processGrades() {
		//output grades array
		outputGrades();
		 // call method getAverage to calculate the average grade
		System.out.printf("%nClass average is %.2f%n", getAverage());
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
		int lowGrade = grades[0];// assume grades[0] is smallest
		//loop through grades array
		for(int grade : grades) {
	        // if grade lower than lowGrade, assign it to lowGrade
			if (grade < lowGrade)
				lowGrade = grade;// new lowest grade
		   }
		    return lowGrade;
	}
	public int getMaximum() {
		int highGrade = grades[0];// assume grades[0] is largest
		//loop through grades array
		for(int grade : grades) {
	        // if grade higher than highGrade, assign it to lowGrade
			if (grade > highGrade)
				highGrade = grade;// new highest grade
		   }
		    return highGrade;
	}
	public double getAverage() {
		int total = 0;
		// sum grades for one student
		for(int grade : grades)
			total += grade;
		//return average of grades
		return (double)total / grades.length;
	}
	         //output bar chart displaying grade distribution
	         //GETTER METHOD FOR bar chart
	public void outputBarchart() {
		System.out.println("Grade distribution:");
		 // stores frequency of grades in each range of 10 grades
		int [] frequency = new int  [11];
		// for each grade, increment the appropriate frequency
		for(int grade : grades)
			++frequency [grade / 10];
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
	  // output the contents of the grades array
	     public void outputGrades() {
	    	 System.out.printf("the grades are %n%n");
	    	  // output each student's grades
	    	 for(int students = 0; students < grades.length; students++) {
	    	System.out.printf("student %d: %d%n", students + 1, grades[students]);
	    	 }
	    	 
	     }
}
