package gradebook;
import java.util.*;

public class Course {
	/**Course Object
	 * code (string) ex: ENG3U
	 * year (int) ex: 4
	 * sem (int) ex: 2
	 * marks (int array size 10) ex: marks[0] = 78
	**/
	String code;
	int year;
	int sem;
	ArrayList<Integer> marks = new ArrayList<Integer>();
	//int[] marks = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	/** Course
	 *  creates new Course object
	 *  @param: course code (String), year of course (int), semester of course (int)
	 *  @return: void
	**/
	public Course(String inpCode, int inpYear, int inpSem){
		code = inpCode;
		sem = inpSem;
		year = inpYear;
	}
	
	/** getSem
	 *  returns the semester of the course
	 *  @param: null
	 *  @return: void
	**/
	public int getSem() {
		return sem;
	}
	
	/** getYear
	 *  returns the year the course was taken
	 *  @param: null
	 *  @return: int
	**/
	public int getYear() {
		return year;
	}
	
	/** getCode
	 *  returns course code 
	 *  @param: null
	 *  @return: String
	**/
	public String getCode() {
		return code;
	}
	
	/** getMarks
	 *  returns ArrayList of marks for the course
	 *  @param: null
	 *  @return: int[]
	**/
	public ArrayList<Integer> getMarks() {
		return marks;
	}
	
	/** addMark
	 *  adds new mark to marks ArrayList
	 *  @param: new mark (int)
	 *  @return: void
	**/
	public void addMark(int mark) {
		marks.add(mark);
		return;
	}
	
	/** avg
	 *  returns average mark for course 
	 *  @param: null
	 *  @return: double
	**/
	public double avg() {
		int avg = 0;
		if(marks.size() == 0) {
			return 0.0;
		}
		for(int x : marks) {
			avg+=x;
		}
		return (double)(avg/marks.size());
	}
	
	/** toString
	 *  returns String representation of a Course object
	 *  @param: null
	 *  @return: String
	**/
	public String toString() {
		return code+"\t\t"+year+"/"+sem+"\t\t"+marks.size()+"\t\t"+this.avg();
	}
	
}
