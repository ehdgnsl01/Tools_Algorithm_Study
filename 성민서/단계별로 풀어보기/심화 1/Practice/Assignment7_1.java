import java.util.*;
public class Assignment7_1 {
	public static void main(String[] args) {
	    Course course1 = new Course("Data Structures");
	    Course course2 = new Course("Database Systems");

	    course1.addStudent("Ethan Smith");
	    course1.addStudent("Lucas Smith");
	    course1.addStudent("Oliver Smith");

	    course2.addStudent("Park");
	    course2.addStudent("Son");
	    course2.addStudent("Kim");
	    course2.addStudent("Cha");

	    System.out.println("Number of students in course1: "
	      + course1.getNumberOfStudents());
	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
	      System.out.print(course1.getStudents()[i] + ", ");
	    
	    System.out.println();
	    
	    System.out.println("Number of students in course2: "
	      + course2.getNumberOfStudents());
	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
		  System.out.print(course2.getStudents()[i] + ", ");
	    
	    course1.dropStudent("Ethan Smith");
	    
	    System.out.println();
	    System.out.println("Number of students in course1 after drop Ethan Smith: "
	  	      + course1.getNumberOfStudents());
	    
	    for (int i = 0; i < course1.getNumberOfStudents(); i++)
		      System.out.print(course1.getStudents()[i] + ", ");
	    
	    course1.clear();
	    System.out.println();
	    System.out.println("Number of students in course1 after clear: "
	  	      + course1.getNumberOfStudents());
	    
	    course2.dropStudent("Kim");
	    System.out.println("Number of students in course2 after drop Kim: "
	  	      + course2.getNumberOfStudents());
	    
	    for (int i = 0; i < course2.getNumberOfStudents(); i++)
		      System.out.print(course2.getStudents()[i] + ", ");
	    
	    course2.clear();
	    System.out.println();
	    System.out.println("Number of students in course2 after clear: "
	  	      + course2.getNumberOfStudents());
	  }
}

class Course {
  private String courseName;
  private String[] students = new String[2];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
	if (numberOfStudents >= students.length) {
		String[] temp = new String[students.length * 2];
	    System.arraycopy(students, 0, temp, 0, students.length);
	    students = temp;
	}
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
	  int i;
	  for(i=0;i<=2;i++) {
    	if(students[i]==student) break;
    }
    String[]temp=new String[students.length];
    System.arraycopy(students, i+1, temp, i, students.length-i-1);
    System.arraycopy(temp, i, students, i, students.length-i-1);
    numberOfStudents--;
  }
  
  public void clear() {
	  students = null;
	  numberOfStudents=0;
  }
}