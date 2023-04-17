import gradebook.Student;
import gradebook.Course;
import java.util.*;


public class gradebook {
	
	//TODO: 
	// - getters / setters
	// - level to %, level to letter, % to letter
	// - average (semester, class, total)
	// - transcript (semester, class, total) 
	
	//Class object 
	//properties 
	// name (str), year (int), sem (int)
	// marks (array of ints)
	
	//Student Object
	// properties:
	// name (str), grade (int)
	// classes (array of Class Objects)
	
	
	//gradebook methods:
	// level to %, % to level
	// 
	
	public void totalTranscript(Student stu) {
		/** Sample Print:
		 * 
		 * 			STUDENT TRANSCRIPT
		 * Name: studentName	Grade: 9
		 * 
		 * Overall Average: 90%
		 * 
		 * Course				Year/Sem 	Mark
		 * ------------			----------	-----
		 * CourseCode1			9/2			89
		 * CourseCode2			9/2			75
		 * CourseCode3 			9/1			56
		 * ....
		 * 		
		 * */
		System.out.println("\t\t\tSTUDENT TRANSCRIPT");
		System.out.println("Name: "+stu.getName()+"\tGrade: "+stu.getGrade());
		System.out.println("\nOverall Average: "+stu.totalAvg()+"%\n");
		System.out.println("Course\t\t\t\tYear/Sem\t\tMark");
		System.out.println("------------\t\t\t----------\t-----");
		for(Course c : stu.getCourses()) {
			System.out.println(c.getCode()+"\t\t\t"+c.getYear()+"/"+c.getSem()+"\t\t"+c.avg());
		}

		return;
	}
	
	public void yearTranscript(Student stu, int year) {
		System.out.println("\t\t\tSTUDENT TRANSCRIPT");
		System.out.println("Name: "+stu.getName()+"\tGrade: "+stu.getGrade());
		System.out.println("Year: "+year);
		System.out.println("\nYear Average: "+stu.yearAvg(year)+"%\n");
		System.out.println("Course\t\t\t\tYear/Sem\t\tMark");
		System.out.println("------------\t\t\t----------\t-----");
		for(Course c : stu.getCourses()) {
			if(c.getYear() == year) {
				System.out.println(c.getCode()+"\t\t\t"+c.getYear()+"/"+c.getSem()+"\t\t"+c.avg());
			}
		}
		return;
	}
	
	public void semTranscript(Student stu, int year, int sem) {
		System.out.println("\t\t\tSTUDENT TRANSCRIPT");
		System.out.println("Name: "+stu.getName()+"\tGrade: "+stu.getGrade());
		System.out.println("Year: "+year+"\t Semester: "+sem);
		System.out.println("\nSemester Average: "+stu.yearAvg(year)+"%\n");
		System.out.println("Course\t\t\t\tYear/Sem\t\tMark");
		System.out.println("------------\t\t\t----------\t-----");
		for(Course c : stu.getCourses()) {
			if(c.getYear() == year && c.getSem() == sem) {
				System.out.println(c.getCode()+"\t\t\t"+c.getYear()+"/"+c.getSem()+"\t\t"+c.avg());
			}
		}
		return;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course testCourse = new Course("test", 1, 1);
		Student testStudent = new Student("testStudent", 9); 
		
		
		System.out.println(testCourse.avg());
		System.out.println(testStudent.getName());
		
		
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

	}

}
