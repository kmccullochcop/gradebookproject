package gradebook;

import java.util.*;
import gradebook.Course;

public class Student {

	/** Student Object
	 * properties:
	 * 		name (String) ex: Bob
	 * 		grade (int) ex: 11
	 * 		courses (Course array) ex: courses[0] = { "ENG3U", 3, 1, marks} 
	 **/
	String name;
	int grade;
	ArrayList<Course> courses = new ArrayList<Course>();

	
	/** Student
	 *  creates new Student object
	 *  @param: inpName (String), inpGrade (int)
	 *  @return: void
	**/
	public Student(String inpName, int inpGrade){
		name = inpName;
		grade = inpGrade;
	}
	
	/**	setName
	 * sets the name of the student
	 * @param: new name (String)
	 *  @return: void
	 *  **/
	public void setName(String newName) {
		name = newName;
	}
	
	/**	getName
	 * returns the student's name
	 * @param: null
	 * @return: String
	**/
	public String getName() {
		return name;
	}
	/** setGrade
	 *  changes the current grade value for the student
	 *  @param: new grade (int)
	 *  @return: void
	**/
	public void setGrade(int inpGrade) {
		grade = inpGrade;
	}
	
	/** getGrade
	 *  returns the current grade value for the student
	 *  @param: null
	 *  @return: int
	**/
	public int getGrade() {
		return grade;
	} 
  
	/** addCourse
	 *  adds new Course to ArrayList of courses
	 *  @param: course code (String), course year (int), course semester (int)
	 *  @return: void
	**/
	public void addCourse(String courseCode, int courseYear, int courseSemester) {
		courses.add(new Course(courseCode, courseYear, courseSemester));
		return;
	}
	
	/** getCourse
	 *  returns a course as specified by code, year, and semester
	 *  @param: course code (String), year (int), sem (int)
	 *  @return: void
	**/
	//public Course 
	
	/** addMark
	 *  adds new mark to a given course
	 *  @param: course code (String), newMark (int)
	 *  @return: void
	**/
	public void addMark(String courseCode, int newMark) {
		return;
	}
	
	/** setCourse
	 *  adds a new course to the courses array at a given index
	 *  @param: index (int), course code (String), year (int), semester (int)
	 *  @return: void
	**/
//	public void setCourse(int index, String courseCode, int year, int sem) {
//		if(index < courses.length) {
//			courses[index] = new Course(courseCode, year, sem);
//		}
//		return;
//	}
	
	/** getCourses
	 * 	returns the array of courses
	 *  @param: null
	 *  @return: Course[]
	**/
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	/** getCoursesByYear
	 *  returns Course ArrayList of courses from a given year
	 *  @param: year (int)
	 *  @return: Course ArrayList 
	**/
	public ArrayList<Course> getCoursesByYear(int year){
		ArrayList<Course> yearCourses = new ArrayList<>();
		for(Course c : courses) {
			if(c.getYear() == year) {
				yearCourses.add(c);
			}
		}
		return yearCourses;
	}
	
	/** getCoursesBySemester
	 *  returns Course ArrayList of courses from a given semester
	 *  @param: semester (int), year (int)
	 *  @return: Course ArrayList 
	**/
	public ArrayList<Course> getCoursesBySem(int year, int sem){
		ArrayList<Course> semCourses = new ArrayList<>();
		for(Course c : courses) {
			if(c.getYear() == year && c.getSem() == sem) {
				semCourses.add(c);
			}
		}
		return semCourses;
	}
	
	
	/** semAvg
	 *  returns the average of a student's courses across one semester
	 *  @param: semester (int), year (int)
	 *  @return: double
	**/
	public double semAvg(int sem, int year) {
		//for all courses w/ matching sem # & year #
		//course.avg() 
		//then avg the answer
		double avg = 0;
		int numCourses = 0;
		for(Course c : courses) {
			if (c.getYear() == year && c.getSem() == sem) {
				avg+=c.avg();
				numCourses++;
			}
		}
		return avg/numCourses;
	}
	
	/** yearAvg
	 *  returns the average of a student's courses across one year
	 *  @param: year (int)
	 *  @return: double
	**/
	
	public double yearAvg(int year) {
		double avg = 0;
		int numCourses = 0;
		for(Course c : courses) {
			if (c.getYear() == year) {
				avg+=c.avg();
				numCourses++;
			}
		}
		return avg/numCourses;
	}
	
	/** totalAvg
	 *  returns the average of a student's courses across all years
	 *  @param: null
	 *  @return: double
	**/
	public double totalAvg() {
		double avg = 0;
		for(Course c : courses) {
			avg+=c.avg();
		}
		return avg/(courses.size());
	}
	
	/** toString
	 *  returns the String representation of a student object
	 *  @param: null
	 *  @return: double
	**/
	public String toString() {
		String coursesString = "";
		for(Course c : courses) {
			coursesString += c.toString();
		}
		return "Student: "+name+"\tGrade: "+grade+
				"\n Courses:\n"+coursesString;
	}
	
	
	
}
