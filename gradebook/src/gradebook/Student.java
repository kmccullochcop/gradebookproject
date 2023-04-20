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
	public Student(){
		this.name = "Default Name";
		this.grade = 9;
	}
	
	/** Student
	 *  creates new Student object w/ given name and grade
	 *  @param: inpName (String), inpGrade (int)
	 *  @return: void
	**/
	public Student(String inpName, int inpGrade){
		this.name = inpName;
		this.grade = inpGrade;
	}
	
	/**	setName
	 * sets the name of the student
	 * @param: new name (String)
	 *  @return: void
	 *  **/
	public void setName(String newName) {
		this.name = newName;
	}
	
	/**	getName
	 * returns the student's name
	 * @param: null
	 * @return: String
	**/
	public String getName() {
		return this.name;
	}
	
	/** setGrade
	 *  changes the current grade value for the student
	 *  @param: new grade (int)
	 *  @return: void
	**/
	public void setGrade(int inpGrade) {
		this.grade = inpGrade;
	}
	
	/** getGrade
	 *  returns the current grade value for the student
	 *  @param: null
	 *  @return: int
	**/
	public int getGrade() {
		return this.grade;
	} 
  
	/** addCourse
	 *  adds new Course to ArrayList of courses
	 *  @param: course code (String), course year (int), course semester (int)
	 *  @return: void
	**/
	public void addCourse(String courseCode, int courseYear, int courseSemester) {
		this.courses.add(new Course(courseCode, courseYear, courseSemester));
		return;
	}
	
	/** addMark
	 *  adds new mark to a given course
	 *  @param: course code (String), newMark (int)
	 *  @return: void
	**/
	public void addMark(Course course, int newMark) {
		this.courses.get(this.courses.indexOf(course)).addMark(newMark);
		return;
	}
	
	/** getCourses
	 * 	returns the array of courses
	 *  @param: null
	 *  @return: ArrayList<Course>
	**/
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
	
	/** getCourse
	 * 	returns a course, as specified by inputs
	 *  @param: code (String), year (int), sem (int)
	 *  @return: Course
	**/
	public Course getCourse(String code, int year, int sem) {
		for(Course c : this.courses) {
			if(c.getCode().equals(code) && c.getYear() == year && c.getSem() == sem) {
				System.out.println(c);
				return c;
			}
		}
		return new Course(null, -1, -1);
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
		for(Course c : this.courses) {
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
		for(Course c : this.courses) {
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
		for(Course c : this.courses) {
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
		for(Course c : this.courses) {
			coursesString += c.toString();
		}
		return "Student: "+this.name+"\tGrade: "+this.grade+
				"\n Courses:\n"+coursesString;
	}
	
	
	//OPTIONAL (Level 4) EXTENSIONS ONCE BASE IS COMPLETE
	/** getCourses
	 * 	overloading getCourses
	 *  returns Course ArrayList of courses from a given year
	 *  @param: year (int)
	 *  @return: ArrayList<Course> 
	**/
	public ArrayList<Course> getCourses(int year){
		ArrayList<Course> yearCourses = new ArrayList<>();
		for(Course c : this.courses) {
			if(c.getYear() == year) {
				yearCourses.add(c);
			}
		}
		return yearCourses;
	}
	
	/** getCourses
	 * 	overloading getCourses
	 *  returns Course ArrayList of courses from a given semester
	 *  @param: semester (int), year (int)
	 *  @return: ArrayList<Course> 
	**/
	public ArrayList<Course> getCourses(int year, int sem){
		ArrayList<Course> semCourses = new ArrayList<>();
		for(Course c : this.courses) {
			if(c.getYear() == year && c.getSem() == sem) {
				semCourses.add(c);
			}
		}
		return semCourses;
	}
	
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
	public ArrayList<Course> getCourses(String sub){
		ArrayList<Course> subCourses = new ArrayList<>();
		for(Course c : this.courses) {
			System.out.println(c.getCode().substring(0,3));
			if(c.getCode().length() >=4 && sub.equals(c.getCode().substring(0, 3))) {
				subCourses.add(c);
			}
		}
		return subCourses;
	}
	
}
