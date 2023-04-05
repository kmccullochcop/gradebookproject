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
	Course[] courses = new Course[12];
	
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
	
	//level 4 
	//have to use Courses as ArrayList
	public void addCourse() {
		return;
	}
	
	public void setCourse(int index, String courseCode, int year, int sem) {
		if(index < courses.length) {
			courses[index] = new Course(courseCode, year, sem);
		}
		return;
	}
	
	public Course[] getCourses() {
		return courses;
	}
	
	public void totalTranscript() {
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
		System.out.println("Name: "+name+"\tGrade: "+grade);
		System.out.println("\nOverall Average: "+this.totalAvg()+"%\n");
		System.out.println("Course\t\t\t\tYear/Sem\t\tMark");
		System.out.println("------------\t\t\t----------\t-----");
		for(Course x : courses) {
			System.out.println(x.getCode()+"\t\t\t"+x.getYear()+"/"+x.getSem()+"\t\t"+x.avg());
		}

		return;
	}
	
	public void yearTranscript(int year) {
		System.out.println("\t\t\tSTUDENT TRANSCRIPT");
		System.out.println("Name: "+name+"\tGrade: "+grade);
		System.out.println("Year: "+year);
		System.out.println("\nYear Average: "+this.yearAvg(year)+"%\n");
		System.out.println("Course\t\t\t\tYear/Sem\t\tMark");
		System.out.println("------------\t\t\t----------\t-----");
		for(Course x : courses) {
			if(x.getYear() == year) {
				System.out.println(x.getCode()+"\t\t\t"+x.getYear()+"/"+x.getSem()+"\t\t"+x.avg());
			}
		}
		return;
	}
	
	public void semTranscript(int year, int sem) {
		System.out.println("\t\t\tSTUDENT TRANSCRIPT");
		System.out.println("Name: "+name+"\tGrade: "+grade);
		System.out.println("Year: "+year+"\t Semester: "+sem);
		System.out.println("\nSemester Average: "+this.yearAvg(year)+"%\n");
		System.out.println("Course\t\t\t\tYear/Sem\t\tMark");
		System.out.println("------------\t\t\t----------\t-----");
		for(Course x : courses) {
			if(x.getYear() == year && x.getSem() == sem) {
				System.out.println(x.getCode()+"\t\t\t"+x.getYear()+"/"+x.getSem()+"\t\t"+x.avg());
			}
		}
		return;
	}
	
	public double classAvg() {
		//use Course.avg();
		double avg = 0;
		for(Course x : courses) {
			avg += x.avg();
		}
		return avg/courses.length;
	}
	
	public double semAvg(int sem, int year) {
		//for all courses w/ matching sem # & year #
		//course.avg() 
		//then avg the answer
		double avg = 0;
		int numCourses = 0;
		for(Course x : courses) {
			if (x.getYear() == year && x.getSem() == sem) {
				avg+=x.avg();
				numCourses++;
			}
		}
		return avg/numCourses;
	}
	
	public double yearAvg(int year) {
		double avg = 0;
		int numCourses = 0;
		for(Course x : courses) {
			if (x.getYear() == year) {
				avg+=x.avg();
				numCourses++;
			}
		}
		return avg/numCourses;
	}
	
	public double totalAvg() {
		double avg = 0;
		for(Course x : courses) {
			avg+=x.avg();
		}
		return avg/courses.length;
	}
	
}
