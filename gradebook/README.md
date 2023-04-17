# Gradebook Instructions

## IMPORTANT STUFF

- **Do not change the file structure!** You will need (and already have) 3 files, in 2 separate packages. You will be working ONLY in these files. It looks like this:

// screenshot of file system setup

- **Do not change the code setup WITHIN the files** -- you are given imports, package declarations, and class names. DO NOT CHANGE THESE.

- **Do not change the main method in gradebook.java** . This is what is being used to check if you have created the gradebook properly.

## Part 1 - Course.java

An **object** that will store information about a particular course. The information it stores is:
- code: a **String**, the course code **(ex: MTH1W, ICS3U)**
- year: an **int**, the year of study when the student took the course **(ex: 1, 2, 3, so on )**
- marks: an **int array**, a students last **10** marks in that course.

**The methods you will need to create are:**

-[] to do one?

|  Method Name | purpose | @param | @return |
|--|--|--|--|
| Course() |creates new Course object|course code(String)</br>year (int)</br>semester (int)  | void |
| getSem() |returns the semester the course was taken| N/A | int |
| getYear() |returns the year the course was taken| N/A | int |
| getCode() |returns the course code | N/A | String |
| getMarks() |returns the array of marks | N/A | int[] |
| setMark() |sets a value in the marks array at a given index |new mark (int)</br>index (int) | void |
| avg() |returns the average mark for the course| N/A | double |

## Part 2 - Student.java

Student is an **object** that will store information about a student's studies. The information it stores is:
- name: a **String**, the student's name **(ex: Jim, Sarah, etc.)**
- grade: an **int**, the ***current*** grade of the student (ex: 9, 10, and so on)
- courses: an **Course array**, which holds the last **12** courses that the student has taken.

**The methods you will need to create are:**

|  Method Name | purpose | @param | @return |
|--|--|--|--|
| Student() |creates new student object| student name (String)</br>current grade (int)| void |
| setName() |changes student name| new name (String) | void |
| getName() |returns student name| N/A | String |
| setGrade() |changes the student grade | new grade (int) | void |
| getGrade() |returns the student grade | N/A | int |
| setCourse() |puts a new course object in the courses array at a given index |index (int)</br>code (String)</br>year of course (int)</br>sem of course (int) | void |
| getCourses() |returns the array of courses the student has taken| N/A | Course[] |
| totalAvg() |returns the total average of all courses across all years for a student| N/A | double|
| yearAvg() |returns the total average of all courses across one year for a student| year (int) | double|
| semAvg() |returns the total average of all courses across one semester for a student| year (int), semester (int) | double|