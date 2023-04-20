import gradebook.Student;
import gradebook.Course;
import java.util.*;


public class gradebook {
	
	//Class object 
	//properties 
	// name (str), year (int), sem (int)
	// marks (array of ints)
	
	//Student Object
	// properties:
	// name (str), grade (int)
	// classes (array of Class Objects)
	
	//A1.1 = use constants and variables
	//A1.3 = assignment statements
	//A1.4 = conditionals, bool operators, math
	//A1.5 = describe 1D arrays
	//A1.6 = declare, init, modify, access 1D arrays
	
	//A2.1 = user input
	//A2.2 = sequence/selection/repetition structures
	//A2.3 = nested structures
	
	//A3.1 = use subprograms from system
	//A3.2 = write subprograms
	
	
	/** Sample Print:
	 * 
	 * 			STUDENT TRANSCRIPT
	 * Name: studentName	Grade: 9
	 * 
	 * Overall Average: 90%
	 * 
	 * Course		Year/Sem 	Mark
	 * -------		--------	-----
	 * Course1		9/2			89
	 * Course2		9/2			75
	 * Course3 		9/1			56
	 * ....
	 * 		
	 * */
	
	public static String transcriptHeader (Student stu) {
		return "STUDENT TRANSCRIPT\n----------------------"+
				"\nName: "+stu.getName()+"\tGrade: "+stu.getGrade()+
				"\tOverall Average: "+stu.totalAvg()+"%\n";
				
	}
	
	
	public static void printTranscript(Student stu) {
		System.out.println(transcriptHeader(stu));
		System.out.println("Course\t\tYear/Sem\t# of Marks\tMark\n-------\t\t----------\t-----------\t-----");
		for(Course c : stu.getCourses()) {
			System.out.println(c.toString());
		}
		System.out.println("\n");
		return;
	}
	
	public static void printTranscript(Student stu, int year) {
		System.out.println(transcriptHeader(stu));
		System.out.println("\nYear Average: "+stu.yearAvg(year)+"%\n");
		System.out.println("Course\t\t"+year+"/Sem\t\t# of Marks\tMark\n-------\t\t----------\t-----------\t-----");
		for(Course c : stu.getCourses()) {
			if(c.getYear() == year) {
				System.out.println(c.toString());
			}
		}
		System.out.println("\n");
		return;
	}
	
	public static void printTranscript(Student stu, int year, int sem) {
		System.out.println(transcriptHeader(stu));
		System.out.println("Year: "+year+"\t Semester: "+sem);
		System.out.println("\nSemester Average: "+stu.yearAvg(year)+"%\n");
		System.out.println("Course\t\t"+year+"/"+sem+"\t\t# of Marks\tMark\n-------\t\t----------\t-----------\t-----");
		for(Course c : stu.getCourses()) {
			if(c.getYear() == year && c.getSem() == sem) {
				System.out.println(c.toString());
			}
		}
		System.out.println("\n");
		return;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course testCourse = new Course("test", 1, 1);
		Student testStudent = new Student("testStudent", 9); 
		int[] testMarks = {56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56};
		
		for(int i : testMarks) {
			testCourse.addMark(i);
		}
		
		
		testStudent.addCourse("ICS3U", 3, 2);
//		printTranscript(testStudent);
//		
//		printTranscript(testStudent, 3);
//		
//		printTranscript(testStudent, 3, 2);
		
		System.out.println(testStudent.getCoursesBySem(3, 2));
		System.out.println(testStudent.getCoursesBySem(2, 2));
		
		
		

	}

}
