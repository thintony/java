package Chapter7;

public class StudentGradeArrayTest {

	public static void main(String[] args) {
		int [][] gradesArray = {{87,96,70},{68,57,90},{94,100,90},{100,81,82},
								{83,65,85},{78,87,65},{85,75,83},{91,94,100},
								{76,72,84},{87,93,73}};
		StudentGradeArray myStudentGradeArray = new StudentGradeArray("Maths SS 3", gradesArray);
		System.out.printf(myStudentGradeArray.getCourseName());
		myStudentGradeArray.outputGrades();
		// TODO Auto-generated method stub

	}

}
