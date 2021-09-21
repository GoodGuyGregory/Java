import java.util.Scanner;

/**
 *
 * @author gawitt
 */

public class Course {

  private int MAX = 3;
  private String courseName;
  private String[] students = new String[MAX];
  private int numberOfStudents;
  private static int numberOfCourses = 0; // Static indicates a class variable

  public Course(String courseName) {
    this.courseName = courseName;
    numberOfCourses++;
  }// course

  public int getNumberOfCourses() {
    return numberOfCourses;

  }// getNumberOfCourses

  public void displayNumberOfCourses() {
    System.out.println("Number of Courses: " + numberOfCourses);
  }// displayNumberOfCourses

  public void addStudent(String student) {
    if (numberOfStudents < MAX) {

      students[numberOfStudents] = student;
      System.out.println("Added:" + student);

    } // if
    else {
      System.out.println("Adding more room to the Array.");
      MAX = MAX * 2; // doubles initial capacity
      String[] temp = new String[MAX];
      System.arraycopy(students, 0, temp, 0, numberOfStudents);

      students = temp; // Changed the references in the array.
      students[numberOfStudents] = student;

    } // else
    numberOfStudents++;
  }// addStudent

  public void addStudent() {
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter the Student name.");
    String student = kb.nextLine();

    addStudent(student); // adds the student from the same method implimenting the code to add a student

  }// addStudent

  public String[] getStudents() {
    return students;
  }// getStudents

  public void displayNumberOfStudents() {
    System.out.println("==============================================");
    System.out.println("Number of Students Enrolled in " + courseName + "is " + numberOfStudents);
    System.out.println("==============================================");
  }// displayNumberOfStudents

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public void setCourseName(String newName) {
    courseName = newName;
    System.out.println(courseName);
  }// SetCourseName

  public void dropStudent() {

    Scanner kb = new Scanner(System.in);
    System.out.println("Dropping a Student.");
    displayRoster();

    System.out.print("Enter the number of student to delete.");
    int num = kb.nextInt(); // taking number to reference array index
    num = num - 1; // making it goof proof
    String Temp = students[num];

    for (int i = num + 1; i < numberOfStudents; i++) {
      students[i - 1] = students[i]; // shifting index values up to the previous position

    } // for

    numberOfStudents--;

    displayRoster();
    System.out.println(Temp + " is deleted.");

  }// dropStudent

  public void displayRoster() {
    System.out.println("==================");
    System.out.println("Roster for : " + courseName);
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println((i + 1) + ": " + students[i]);
    } // for

    displayNumberOfStudents();

  }// displayRoster
}// course
