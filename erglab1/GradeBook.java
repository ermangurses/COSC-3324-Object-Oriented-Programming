/*
 * Erman Gurses
 * COSC 3324.001: Object-Oriented Programming
 * Lab1
 */

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName;
   // constructor initializes courseName with String argument
   public GradeBook( String name1, String name2 )
   {
      courseName     = name1; // initializes courseName
      instructorName = name2; // initializes instructorName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name1 )
   {
      courseName = name1; // store the course name
   } // end method setCourseName

   public void setInstructorName( String name2 )
   {
      instructorName = name2; // store the course name
   } // end method setCourseName
   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName
   
   public String getInstructorName()
   {
      return instructorName;
   } // end method getCourseName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
       
       System.out.printf("Welcome %s\n", getCourseName());
       System.out.printf( "This course is presented by: %s\n", 
       getInstructorName());
       
   } // end method displayMessage
} // end class GradeBook
