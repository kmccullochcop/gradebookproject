package gradebook;
import java.util.*;

public class Course {
	/**Course Object
	 * @prop:
	 * 		code (string) ex: ENG3U
	 * 		year (int) ex: 4
	 *		sem (int) ex: 2
	 *		marks (int array size 10) ex: marks[0] = 78
	**/
	String code;
	int year;
	int sem;
	ArrayList<Integer> marks = new ArrayList<Integer>();
	
	/** Course
	 *  creates new Course object w/ given values
	 *  @param: course code (String), year of course (int), semester of course (int)
	 *  @return: void
	**/
	
	//DO NOT CHANGE THIS METHOD 
	/** toString
	 *  returns String representation of a Course object
	 *  @param: null
	 *  @return: String
	**/
	public String toString() {
		return this.code+"\t\t"+this.year+"/"+this.sem+"\t\t"+this.marks.size()+"\t\t"+this.avg();
	}
	
	/** getSem
	 *  returns the semester of the course
	 *  @param: null
	 *  @return: void
	**/
	
	/** getYear
	 *  returns the year the course was taken
	 *  @param: null
	 *  @return: int
	**/
	
	/** getCode
	 *  returns course code 
	 *  @param: null
	 *  @return: String
	**/
	
	/** getMarks
	 *  returns ArrayList of marks for the course
	 *  @param: null
	 *  @return: int[]
	**/
	
	/** addMark
	 *  adds new mark to marks ArrayList
	 *  @param: new mark (int)
	 *  @return: void
	**/
	
	/** avg
	 *  returns average mark for course 
	 *  @param: null
	 *  @return: double
	**/
	
	
}
