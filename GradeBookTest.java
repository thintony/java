package Chapter7;
// then invokes method processGrades to analyze them. 
public class GradeBookTest {

	public static void main(String[] args) {
		// array of student grades       
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		GradeBook myGradeBook = new GradeBook("PHYSICS FOR SS 2",
				gradesArray);
		System.out.println(myGradeBook.getCourseName());
		
		myGradeBook.outputGrades();
	System.out.println(myGradeBook.getAverage());
		System.out.println(myGradeBook.getMinimum());
	System.out.println(myGradeBook.getMaximum());
		myGradeBook.outputBarchart();
		
			// TODO Auto-generated method stub

	}

}
