package gradebook;

import java.util.*;
import gradebook.Course;

public class Student {

	/** Student Object
	 * @prop:
	 * 		name (String) ex: Bob
	 * 		grade (int) ex: 11
	 * 		courses (Course array) ex: courses[0] = { "ENG3U", 3, 1, marks} 
	 **/
	String name;
	int grade;
	ArrayList<Course> courses = new ArrayList<Course>();
	
	/** Student
	 *  creates new Student object w/ default values
	 *  @param: inpName (String), inpGrade (int)
	 *  @return: void
	**/
	
	/** Student
	 *  creates new Student object w/ given name and grade
	 *  @param: inpName (String), inpGrade (int)
	 *  @return: void
	**/
	
	//DO NOT CHANGE THIS METHOD
	/** toString
	 *  returns the String representation of a student object
	 *  @param: null
	 *  @return: double
	**/
	public String toString() {
		String coursesString = "";
		for(Course c : this.courses) {
			coursesString += c.toString();
		}
		//Student: Default Name		Grade: 9 		
		return "Student: "+this.name+"\tGrade: "+this.grade;
	}
	
	/**	setName
	 * sets the name of the student
	 * @param: new name (String)
	 *  @return: void
	 *  **/
	
	/**	getName
	 * returns the student's name
	 * @param: null
	 * @return: String
	**/
	
	/** setGrade
	 *  changes the current grade value for the student
	 *  @param: new grade (int)
	 *  @return: void
	**/
	
	/** getGrade
	 *  returns the current grade value for the student
	 *  @param: null
	 *  @return: int
	**/
	
	/** getCourses
	 * 	returns the array of courses
	 *  @param: null
	 *  @return: ArrayList<Course>
	**/
	
	/** getCourse
	 * 	returns a course, as specified by inputs
	 *  @param: code (String), year (int), sem (int)
	 *  @return: Course
	**/
  
	/** addCourse
	 *  adds new Course to ArrayList of courses
	 *  @param: course code (String), course year (int), course semester (int)
	 *  @return: void
	**/
	
	/** addMark
	 *  adds new mark to a given course
	 *  @param: course code (String), newMark (int)
	 *  @return: void
	**/
	
	/** avg
	 *  returns a student's overall average
	 *  @param: null
	 *  @return: double
	**/
	
	/** avg
	 * 	overloading avg() 
	 *  returns the average of a student's courses across one semester in one year
	 *  @param: year (int), semester (int)
	 *  @return: double
	**/
	
	/** avg
	 * 	overloading avg() 
	 *  returns the average of a student's courses across one semester in one year
	 *  @param: year (int), semester (int)
	 *  @return: double
	**/
	
	
	//OPTIONAL (Level 4) EXTENSIONS ONCE BASE IS COMPLETE
	/** getCourses
	 * 	overloading getCourses
	 *  returns Course ArrayList of courses from a given year
	 *  @param: year (int)
	 *  @return: ArrayList<Course> 
	**/
	
	/** getCourses
	 * 	overloading getCourses
	 *  returns Course ArrayList of courses from a given semester
	 *  @param: semester (int), year (int)
	 *  @return: ArrayList<Course> 
	**/
	
	/** getCourse
	 *  overloading getCourses so you can find & return all courses matching partial input
	 *  ex: getCourse(code), getCourse(code, year), getCourse(code, sem), ...
	 *  @param: up to you! 
	 *  @return: Course ArrayList 
	**/
	
	/** getCourses
	 *  overloading getCourses
	 *  return all courses matching a subject code (ex: All English courses have codes ENG**) 
	 *  @param: subject (String)
	 *  @return: Course ArrayList 
	**/
}
