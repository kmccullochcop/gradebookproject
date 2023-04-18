package gradebook;

import java.util.*;
import gradebook.Course;

public class Student {

	/** Student Object
	 * properties:
	 * name (String) ex: Bob
	 * grade (int) ex: 11
	 * courses (Course array) ex: courses[0] = { "ENG3U", 3, 1, marks} 
	 **/
	String name;
	int grade;
	ArrayList<Course> courses = new ArrayList<Course>();
//	Course[] courses = new Course[12];
	
	public Student(String inpName, int inpGrade){
		name = inpName;
		grade = inpGrade;
	}
	
	public void setName(String inpName) {
		name = inpName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGrade(int inpGrade) {
		grade = inpGrade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void addCourse(String courseCode, int year, int sem) {
		courses.add(new Course(courseCode, year, sem));
		return;
	}
	
//	public void setCourse(int index, String courseCode, int year, int sem) {
//		if(index < courses.length) {
//			courses[index] = new Course(courseCode, year, sem);
//		}
//		return;
//	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
//	public Course[] getCoursesYear(int year){
//		
//		for(Course c : courses) {
//			if(c.getYear() == year) {
//				
//			}
//		}
//	}
	
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
	
	public double totalAvg() {
		double avg = 0;
		for(Course c : courses) {
			avg+=c.avg();
		}
		return avg/courses.length;
	}
	
}
