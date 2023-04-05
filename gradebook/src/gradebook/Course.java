package gradebook;
import java.util.*;

public class Course {
	/**Course Object
	 * code (string) ex: ENG3U
	 * year (int) ex: 4
	 * sem (int) ex: 2
	 * marks (int array size 10) ex: marks[0] = 78
	 * 
	**/
	String code;
	int year;
	int sem;
	//Level 4 => marks as ArrayList rather than set array
	int[] marks = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	public Course(String inpCode, int inpYear, int inpSem){
		code = inpCode;
		sem = inpSem;
		year = inpYear;
	}
	
	public int getSem() {
		return sem;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getCode() {
		return code;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	public void setMark(int inpMark, int index) {
		if(index < marks.length) {
			marks[index] = inpMark;
		}
		return;
	}
	
	//level 4 method
	//have to use marks as array lists
	public void addMark(int mark) {
		return;
	}
	
	public double avg() {
		int avg = 0;
		for(int x : marks) {
			avg+=x;
		}
		return (double)(avg/marks.length);
	}
	
}
