import gradebook.Student;
import gradebook.Course;
import java.util.*;


public class gradebook {
	//arrays of basic grades
	static final int[] grades1 = {80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90}; //avg 85
	static final int[] grades2 = {50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60}; //avg 55
	
	//arrays of courses to test with
	//year 1 sem 1, ENG1W, 1, 1, MTH1W, 1, 1, PPL1O, 1, 1, CHV2O, 1, 1
	static final String[] gr9sem1 = {"ENG1W", "MTH1W", "PPL1O", "CHV2O"};
	
	//year 1 sem 2, SNC1W, 1, 2, FEF1D, 1, 2, CGC1D, 1, 2, ALC1O, 1, 2
	static final String[] gr9sem2  = {"SNC1W", "FEF1D", "CGC1D", "ALC1O"};
	
	//year 2 sem 2, ENG2W, 2, 1, SNC2D, 2, 1, FEF2D, 2, 1, BB12O, 2, 1
	static final String[] gr10sem1 = {"ENG2D", "SNC2D", "FEF2D", "BB12O"};
			
	//year 2 sem 2, MTH2D, 2, 2, ICS2O, 2, 2, CHC2D, 2, 2, BTT2O, 2, 2
	static final String[] gr10sem2 = {"MTH2D", "ICS2O", "CHC2D", "BTT2O"};
	
	//year 3 sem 1, ENG3U, 3, 1, ICS3U, 3, 1, FEF3U, 3, 1, BD13C, 3, 1
	static final String[] gr11sem1 = {"ENG3U", "ICS3U", "FEF3U", "BD13C"};
	
	//year 3 sem 2, MCR3U, 3, 2, HSP3U, 3, 2, BAF3M, 3, 2, CLU3M, 3, 2
	static final String[] gr11sem2 = {"MCR3U", "HSP3U", "BAF3M", "CLU3M"};
	
	//year 4 sem 1, MHF4U, 4, 1, ICS4U, 4, 1, MDM4U, 4, 1, CLN4C, 4, 1
	static final String[] gr12sem1 = {"MHF4U", "ICS4U", "MDM4U", "CLN4C"};
	
	//year 4 sem 2, ENG4U, 4, 2, MCV4U, 4, 2, FEF4U, 4, 2, BAT4M, 4, 2
	static final String[] gr12sem2 = {"ENG4U", "MCV4U", "FEF4U", "BAT4M"};

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
				"\tOverall Average: "+stu.avg()+"%\n";
				
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
		System.out.println("\nYear Average: "+stu.avg(year)+"%\n");
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
		System.out.println("\nSemester Average: "+stu.avg(year)+"%\n");
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
		
		System.out.println("---------------------\nPassed: "+testCourse()+"/6 for Course class");
		System.out.println("---------------------\n");
		System.out.println("Passed: "+testStudent()+"/16 for Student class\n---------------------");
		

	}
	
	public static int testStudent() {
		System.out.println("Test Student Class");
		System.out.println("---------------------");
		int count = 0;
		count += testStudentGetSet();
		count += testStudentCourse();
		count += testStudentAvgs();
		
//		count += testStudentExtensions();
		return count;
		
	}
	public static int testStudentGetSet() {
		System.out.println("\nGetter & Setter Methods");
		System.out.println("---------------------");
		int count = 0;
		//create student w/ info
		try {
			//create default student
			System.out.println("new Student();");
			Student defaultStu = new Student();
			count += checkResult("Student: Default Name	Grade: 9", defaultStu.toString());
			
			System.out.println("new Student(name, grade);");
			Student test = new Student("testStu", 9);
			count += checkResult("Student: testStu	Grade: 9", test.toString());
			
			System.out.println("Student.getName();");
			count +=  checkResult("testStu", test.getName());
			
			System.out.println("Student.getGrade();");
			count +=  checkResult(9, test.getGrade());
			
			System.out.println("Student.setName(name)");
			test.setName("testStudent");
			count += checkResult("testStudent", test.getName());
			
			System.out.println("Student.setGrade(10)");
			test.setGrade(10);
			count += checkResult(10, test.getGrade());
		}catch(Exception e){
			System.out.println("Error during testStudentGetSet()");
		}
		
		System.out.println("\nPassed: "+count+"/6");
		System.out.println("---------------------");
		return count;
	}
	public static int testStudentCourse() {
		System.out.println("\nStudent Course methods");
		System.out.println("---------------------");
		int count = 0;
		ArrayList<Course> defaultCourse = new ArrayList<Course>();
		defaultCourse.add(new Course("TEST00", 0, 0));
		
		//create student w/ info
		try {
			Student test = new Student("testStu", 9);
			
			System.out.println("Student.getCourses()");
			count += checkResult("[]", test.getCourses().toString());
			
			
			System.out.println("Student.addCourse(code, year, sem)");
			test.addCourse("TEST00", 0, 0);
			count += checkResult(defaultCourse.toString(), test.getCourses().toString());
			
			
			
			System.out.println("Student.getCourse(code, year, sem)");
			count+=checkResult(defaultCourse.get(0).toString(), test.getCourse("TEST00", 0, 0).toString());
			
			
			defaultCourse.get(0).addMark(56);
			
			System.out.println("Student.addMark(course, mark)");
			test.addMark(test.getCourse("TEST00", 0, 0), 56);
			count += checkResult(defaultCourse.toString(), test.getCourses().toString());
			
		}
		catch(Exception e){
			System.out.println("Error during testStudentCourse()");
			
		}
		System.out.println("\nPassed: "+count+"/4");
		System.out.println("---------------------");
		return count;
	}
	public static int testStudentAvgs() {
		System.out.println("\nStudent.avg() methods");
		System.out.println("---------------------");
		int count = 0;
		//create student w/ info
		Student test = new Student("testStu", 9);
		try {
			for(int x = 0; x < gr9sem1.length; x++) {
				test.addCourse(gr9sem1[x], 1, 1);
			}
			for(int x = 0; x < gr9sem2.length; x++) {
				test.addCourse(gr9sem2[x], 1, 2);
			}
			for(int x = 0; x < gr10sem1.length; x++) {
				test.addCourse(gr10sem1[x], 2, 1);
			}
			
			for(Course c : test.getCourses()) {
				for(int x = 0; x < grades1.length; x++) {
					if(c.getSem() == 1) {
						test.addMark(c, grades1[x]);
					}
					else {
						test.addMark(c, grades2[x]);
					}
				}
			}
			
			System.out.println("Student.avg()");
			count += checkResult(75, test.avg());
			
			System.out.println("Student.avg(year)");
			count += checkResult(70, test.avg(1));
			count += checkResult(85, test.avg(2));
			
			System.out.println("Student.avg(year, sem)");
			count += checkResult(85, test.avg(1, 1));
			count += checkResult(85, test.avg(2, 1));
			count += checkResult(55, test.avg(1, 2));
			
			
		}
		catch(Exception e){
			System.out.println("Error during testStudentAvgs()");
			
		}
		
		System.out.println("\nPassed: "+count+"/6");
		System.out.println("---------------------");
		return count;
	}
	
	public static int testStudentExtensions() {
		int count = 0;
		//create student w/ info
		Student test = new Student("testStu", 9);
		
		try {
			for(int x = 0; x < gr9sem1.length; x++) {
				test.addCourse(gr9sem1[x], 1, 1);
			}
			for(int x = 0; x < gr9sem2.length; x++) {
				test.addCourse(gr9sem2[x], 2, 1);
			}
			for(int x = 0; x < gr10sem1.length; x++) {
				test.addCourse(gr10sem1[x], 2, 1);
			}
			//test.getCourses(year);
			//test.getCourses(year, sem);
			//test.getCourses(sub);
		}
		catch(Exception e){
			System.out.println("Error during testStudentExtensions()");
			return count;
		}
		return count;

	}
	
	public static int testCourse() {
		System.out.println("Test Course Class");
		System.out.println("---------------------");
		int count = 0;
		try {
			//course creations
			System.out.println("new Course(code, year, sem)");
			Course testC = new Course("ICS3U", 3, 2);
			count += checkResult("ICS3U		3/2		0		0.0", testC.toString());
			
			System.out.println("Course.getYear()");
			count += checkResult("ICS3U", testC.getCode());
			
			System.out.println("Course.getYear()");
			count += checkResult(3, testC.getYear());
			
			System.out.println("Course.getSem()");
			count += checkResult(2, testC.getSem());
			
			System.out.println("Course.getMarks()");
			count += checkResult("[]", testC.getMarks().toString());
			
			System.out.println("Course.addMark(mark)");
			for(int x=0; x<4; x++) {
				testC.addMark(grades1[x]);
			}
			count += checkResult("[80, 81, 82, 83]", testC.getMarks().toString());
			
			System.out.println("Course.avg()");
			count += checkResult(81.5, testC.avg());
			
		}catch(Exception e) {
			System.out.println("Error during testCourse()");
		}
		
		return count;
	}
	
	public static int checkResult(String expected, String actual) {
		System.out.println("\tExpected:\t"+expected);
		System.out.println("\tActual:\t\t"+actual);
		if(expected.equals(actual)) {
			return 1;
		}
		return 0;
	}
	public static int checkResult(int expected, int actual) {
		System.out.println("\tExpected:\t"+expected);
		System.out.println("\tActual:\t\t"+actual);
		if(expected == actual) {
			return 1;
		}
		return 0;
	}
	public static int checkResult(double expected, double actual) {
		System.out.println("\tExpected:\t"+expected);
		System.out.println("\tActual:\t\t"+actual);
		if(expected == actual) {
			return 1;
		}
		return 0;
	}
//	public static int checkResult(ArrayList expected, ArrayList actual) {
//		System.out.println("\tExpected:\t"+expected);
//		System.out.println("\tActual:\t\t"+actual);
//		if(expected.equals(actual)) {
//			return 1;
//		}
//		return 0;
//	}
}
