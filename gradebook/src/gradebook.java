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
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course testCourse = new Course("test", 1, 1);
		
		System.out.println(testCourse.avg());

	}

}
