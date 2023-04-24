# Gradebook Instructions
## IMPORTANT STUFF

- **DO NOT change the file structure!** You will need (and already have) 3 files, in 2 separate packages. You will be working ONLY in these files. **DO NOT CHANGE THIS OR YOUR CODE WILL NOT WORK.** It looks like this:
<img width="394" alt="Screen Shot 2023-04-24 at 9 06 54 AM" src="https://user-images.githubusercontent.com/43180758/234005283-c38f7d4b-6fc9-413e-ac66-9862ee463c59.png">

- **DO NOT change the structure setup WITHIN the files** -- you are given imports, package declarations, and class names. **DO NOT CHANGE THESE OR YOUR CODE WILL NOT WORK.**

- **DO NOT change the methods in gradebook.java** . This is what is being used to check if you have created the gradebook properly. You should use your ability to read code in order to see how to create your methods so they will pass these tests.

- **EXCEPT: You may uncomment lines 37-80 in the main method in gradebook.java** as you implement the methods in the Course and Student methods, so that you can test your code. Once you are **finished** with the methods you've been given, **if you would like to extend this code and add user input, other methods, etc., you may ***comment out*** **(i.e. DO NOT DELETE) lines 35-80 in main**

## Part 1 - Course.java

An **object** that will store information about a particular course. The information it stores is:
|  Attribute | Type | Description |
|--|--|--|
|code|String|course code e.g. **ICS3U, MTH1W**|
|year|int|the year that the student took that course **e.g. 9, 10, 11, 12**|
|sem|int|the semester of the year that the student took that course **e.g. 1 or 2**|
|marks|ArrayList<Integer>|an ArrayList of marks from that course|
  
**The methods you will need to create are:**

|  Method Name | purpose | @param | @return |
|--|--|--|--|
| Course() |creates new Course object|course code(String)</br>year (int)</br>semester (int)  | void |
| getSem() |returns the semester the course was taken| N/A | int |
| getYear() |returns the year the course was taken| N/A | int |
| getCode() |returns the course code | N/A | String |
| getMarks() |returns the array of marks | N/A | ArrayList<Integer> |
| addMark() |adds a new mark|new mark (int)| void |
| avg() |returns the average mark for the course| N/A | double |

## Part 2 - Student.java
Student is an **object** that will store information about a student's studies. 
|  Attribute | Type | Description | Default Value |
|--|--|--|--|
|name|String|student's name|Default Name|
|grade|int|student's current grade|9|
|courses|ArrayList<Course>|an ArrayList of courses that the the student has taken| empty |

**The methods you will need to create are:**

|  Method Name | purpose | @param | @return |
|--|--|--|--|
| Student() |creates new student object with default values | N/A | void |
| Student() |creates new student object| student name (String)</br>current grade (int)| void |
| setName() |changes student name| new name (String) | void |
| getName() |returns student name| N/A | String |
| setGrade() |changes the student grade | new grade (int) | void |
| getGrade() |returns the student grade | N/A | int |
| getCourses() |returns the ArrayList of courses the student has taken| N/A | ArrayList<Course> |
| getCourse() |returns the first Course in courses that matches the parameters|</br>code (String)</br>year (int)</br>sem (int) | Course |
| addCourse() |adds a course to the student's courses|</br>code (String)</br>year (int)</br>sem (int) | void |
| addMark() |adds a mark to a course in the student's courses ArrayList|</br>course (Course) </br>year (int)</br>sem (int) | void |
| avg() |returns a student's average of all courses across all years| N/A | double|
| avg() |(overloading avg()) returns a student's average of all courses across **one year** for a student| year (int) | double|
| avg() |(overloading avg() returns a student's average of all courses across **one semester of one year** for a student| year (int), semester (int) | double|


## Extensions:
If you would like to go above and beyond with this project, you may do so in a few different ways. 
Some of these are, but are not limited to:
- overload Student.getCourses() to get courses by year (getCourses(int year))
- overload Student.getCourses() to get courses by semester (getCourses(int year, int sem))
- overload Student.getCourses() to get courses by subject (first 3 characters of course code) (getCourses(String sub))
- and/or whatever else you can think of! 


