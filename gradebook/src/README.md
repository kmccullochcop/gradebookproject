# Gradebook Instructions

## IMPORTANT STUFF
 - **Do not change the file structure!** You will need (and already have) 3 files, in 2 separate packages. You will be working ONLY in these files. It looks like this: 
// screenshot of file system setup
 -  **Do not change the code setup WITHIN the files** -- you are given imports, package declarations, and class names. DO NOT CHANGE THESE. 
 -  **Do not change the main method in gradebook.java** . This is what is being used to check if you have created the gradebook properly. 

## Part 1 - Course.java
An **object** that will store information about a particular course. The information it stores is:
 - code: a **String**, the course code **(ex: MTH1W, ICS3U)**
 - year: an **int**, the year of study when the student took the course **(ex: 1, 2, 3, so on )** 
 - marks: an **int array**, a students last **10** marks in that course. 
**The methods you will need to create are:** 
 1. *Course*
creates a new Course object 
 @param: course code, year of study, semester of study  
 @return: void
 3.  *getSem*
returns the semester the course was taken in
 @param: null 
 @return: int
 4. *getYear*
returns the year the course was taken in
 @param: null 
 @return: int
 5. *getCode*
returns the course code
 @param: null 
 @return: String
 6. *getMarks*
returns the marks for that course
 @param: null 
 @return: int[]
 7. *setMark*
changes the value of a mark at a given index
 @param: null 
 @return: int
 8. *avg*
returns the average mark for the course
 @param: null 
 @return: int

 
## Part 2 - Student.java
Student is an **object** that will store information about a student's studies. The information it stores is:
 - name: a **String**, the student's name **(ex: Jim, Sarah, etc.)**
 - grade: an **int**, the ***current*** grade of the student (ex: 9, 10, and so on)
 - courses: an **Course array**, which holds the last **12** courses that the student has taken. 

**The methods you will need to create are:** 
 1. *Student*
creates a new Student object 
 @param: student name, current grade
 @return: void
 3.  *setName*
returns the semester the course was taken in
 @param: null 
 @return: int
 4. *getName*
returns the year the course was taken in
 @param: null 
 @return: int
 5. *setGrade*
returns the course code
 @param: null 
 @return: String
 6. *getGrade*
returns the marks for that course
 @param: null 
 @return: int[]
 7. *setMark*
changes the value of a mark at a given index
 @param: null 
 @return: int
 8. *avg*
returns the average mark for the course
 @param: null 
 @return: int