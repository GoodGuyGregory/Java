
/**
 *
 * @author gawitt
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Course course1 = new Course("Data Structures");
        // Course course2 = new Course("Database Systems");
        Course course3 = new Course("C201");

        // course1.addStudent("Peter Jones");
        // course1.addStudent("Brian Smith");
        // course1.addStudent("Anne Kennedy");
        // course1.addStudent("Kermit the Frog");

        // course2.addStudent("Peter Jones");
        // course2.addStudent("Steve Smith");
        // course2.addStudent("Dave Thomas");

        ////////////////////////////////////////

        for (int i = 0; i < 8; i++) {
            course3.addStudent();
        } // for

        course3.displayRoster();
        // course3.displayNumberOfCourses();
        // course3.displayNumberOfStudents();
        course3.dropStudent();
        course3.setCourseName("TeaBagging 201");
        cpurse3.displayRoster();

        // System.out.println("Number of students in course1: "
        // + course1.getNumberOfStudents());
        // String[] students = course1.getStudents();
        // for (int i = 0; i < course1.getNumberOfStudents(); i++)
        // System.out.print(students[i] + ", ");

        // System.out.println();
        // System.out.print("Number of students in course2: "
        // + course2.getNumberOfStudents());

    }// main

}// class