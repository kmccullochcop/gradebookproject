import gradebook.Student;
import gradebook.Course;
import java.util.*;


public class gradebook {
	/** ATTENTION!
	 * 	DO NOT CHANGE ANYTHING IN THIS FILE 
	 * 
	 * 	EXCEPT:
	 * 	You may UNCOMMENT the calls to the test methods in main, so that, as you implement the 
	 * 	different classes and methods, you can test your code  
	 * 
	 * 	If, once you are finished with the grade book, you want to extend this, RE-COMMENT lines 33-57
	 * 	and implement whatever code you wish
	**/
	
	//arrays of basic grades for test purposes
	static final int[] grades1 = {80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90}; //avg 85
	static final int[] grades2 = {50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60}; //avg 55
	
	// 2D arrays of course codes for test purposes 
	// gr9[0] = {"ENG1W", "MTH1W", "PPL1O", "CHV2O"}
	// gr9[0][0] = "ENG1W"
	static final String[][] gr9 = {{"ENG1W", "MTH1W", "PPL1O", "CHV2O"},{"SNC1W", "FEF1D", "CGC1D", "ALC1O"}};
	static final String[][] gr10 = {{"ENG2D", "SNC2D", "FEF2D", "BB12O"},{"MTH2D", "ICS2O", "CHC2D", "BTT2O"}};
	static final String[][] gr11 = {{"ENG3U", "ICS3U", "FEF3U", "BD13C"},{"MCR3U", "HSP3U", "BAF3M", "CLU3M"}};
	static final String[][] gr12 = {{"MHF4U", "ICS4U", "MDM4U", "CLN4C"}, {"ENG4U", "MCV4U", "FEF4U", "BAT4M"}};
	
	
	public static void main(String[] args) {
		int count = 0;
		
		
		//TESTS: Un-comment these as you implement the methods in the Student and Course files
		//Course.java 
//		System.out.println("Testing Course Class");
//		System.out.println("--------------------");
//		System.out.println("Passed: "+testCourse()+" /6");
//		System.out.println("--------------------");
//		
////Student.java 
//		System.out.println("Testing Student Class");
//		System.out.println("--------------------");
//
//		System.out.println("Student Getters and Setters");
//		System.out.println("--------------------");
//		count += testStudentGetSet();
//
//		System.out.println("Student Course Methods");
//		System.out.println("--------------------");
//		count += testStudentCourse();
//	
//		System.out.println("Student Avg Methods");
//		System.out.println("--------------------");
//		count += testStudentAvgs();
//		System.out.println("Student Class: Passed: "+count+" /16");
//		System.out.println("--------------------");
//		
////Tests for some OPTIONAL methods you can implement for the Student class
//		System.out.println("Testing Student Class Opt. Methods");
//		System.out.println("--------------------------------");
//		System.out.println("Passed: "+testStudentExtensions()+" /3");
//		System.out.println("--------------------");
		
		
		//Create new student, load in courses, add to student transcript
		
//		Student stuTranscript = new Student("Sample Student", 12);
//				
//		for(int x = 0; x<2; x++) {
//			for(int y = 0; y<4; y++) {
//				stuTranscript.addCourse(gr9[x][y], 1, x+1);
//				stuTranscript.addCourse(gr10[x][y], 2, x+1);
//				stuTranscript.addCourse(gr11[x][y], 3, x+1);
//				stuTranscript.addCourse(gr12[x][y], 4, x+1);
//			}
//			
//		}
//		printTranscript(stuTranscript);
				
	}
	
	public static int testCourse() {
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
	
	public static int testStudentGetSet() {
		int count = 0;
		try {
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
		int count = 0;
		//create student w/ info
		Student test = new Student("testStu", 9);
		
		try {
			for(int x = 0; x < gr9.length; x++) {
				for(int y = 0; y < gr9[x].length; y++) {
					test.addCourse(gr9[x][y], 1, x+1);
					if(x == 0) {
						test.addCourse(gr10[x][y], 2, x+1);
					}
				}
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
		try {
			Student test = new Student("testStu", 9);
			ArrayList<Course> gr9Courses  = new ArrayList<>();
			ArrayList<Course> gr10sem1Courses  = new ArrayList<>();
			ArrayList<Course> ICSCourses  = new ArrayList<>();
			ICSCourses.add(new Course("ICS3U", 3, 1));
			ICSCourses.add(new Course("ICS4U", 4, 1));
			ICSCourses.add(new Course("ICS2O", 2, 2));
			
			for(int x = 0; x<2; x++) {
				for(int y = 0; y<4; y++) {
					gr9Courses.add(new Course(gr9[x][y], 1, x+1));
					if(x == 0) {
						gr10sem1Courses.add(new Course(gr10[x][y], 2, x+1));
					}
					test.addCourse(gr9[x][y], 1, x+1);
					test.addCourse(gr10[x][y], 2, x+1);
					test.addCourse(gr11[x][y], 3, x+1);
					test.addCourse(gr12[x][y], 4, x+1);
				}
			}
			
			System.out.println("Student.getCourses(year)");
			count += checkResult(gr9Courses.toString().replace(",", "\n\t\t\t"), 
					test.getCourses(1).toString().replace(",", "\n\t\t\t"));
			
			System.out.println("Student.getCourses(year, sem)");
			count += checkResult(gr10sem1Courses.toString().replace(",", "\n\t\t\t"), 
					test.getCourses(2, 1).toString().replace(",", "\n\t\t\t"));
			
			System.out.println("Student.getCourses(sub)");
			count += checkResult(ICSCourses.toString().replace(",", "\n\t\t\t"), 
					test.getCourses("ICS").toString().replace(",", "\n\t\t\t"));
		}
		catch(Exception e){
			System.out.println("Error during testStudentExtensions()");
		}
		
		return count;

	}
	
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
		System.out.println("Course\t\t"+year+"/"+sem+"\t\t# of Marks\tMark");
		System.out.println("-------\t\t----------\t-----------\t-----");
		for(Course c : stu.getCourses()) {
			if(c.getYear() == year && c.getSem() == sem) {
				System.out.println(c.toString());
			}
		}
		System.out.println("\n");
		return;
	}
	
	public static int checkResult(String expected, String actual) {
		System.out.println("\tExpected:\t"+expected);
		System.out.println("\tActual:\t\t"+actual+"\n");
		if(expected.equals(actual)) {
			return 1;
		}
		return 0;
	}
	public static int checkResult(int expected, int actual) {
		System.out.println("\tExpected:\t"+expected);
		System.out.println("\tActual:\t\t"+actual+"\n");
		if(expected == actual) {
			return 1;
		}
		return 0;
	}
	public static int checkResult(double expected, double actual) {
		System.out.println("\tExpected:\t"+expected);
		System.out.println("\tActual:\t\t"+actual+"\n");
		if(expected == actual) {
			return 1;
		}
		return 0;
	}

}
