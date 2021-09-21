
import java.io.File;
import java.util.Scanner;

public class GPA_Data {

    // Attributes
    int maleCount = 0;
    int femaleCount = 0;
    double maleTotal = 0;
    double femaleTotal = 0;

    double maleGPA = 0;
    double femaleGPA = 0;

    public void readFile() {

        String[] parts = new String[2];
        System.out.println("in read file");

        File infile = new File("data.txt");

        try {
            Scanner input = new Scanner(infile);

            String line = input.nextLine(); // reading the lines from file
            System.out.println(line); // echo
            parts = line.split(" "); // reads the line in two parts

            while (!parts[0].equals("X")) { // while array index is not an X
                System.out.println(line); // echo

                if (parts[0].equals("M")) {
                    maleCount++;
                    maleTotal += Double.parseDouble(parts[1]); // coverts and adds
                } // if

                else { // female
                    if (parts[0].equals("F")) {
                        femaleCount++;
                        femaleTotal += Double.parseDouble(parts[1]); // coverts to double and adds
                    } // else if
                } // else

                line = input.nextLine(); // get new line
                parts = line.split(" "); // split change of the condition

            } // while

            input.close(); // close the file

            ////// Averages

            maleGPA = maleTotal / maleCount;
            femaleGPA = femaleTotal / femaleCount;

        } // try
        catch (Exception ex) {
            System.out.println(ex);
        } // catch
    }

    public void display() {

        System.out.println("==========================================");
        System.out.println("Count of Males: " + maleCount);
        System.out.printf("GPA of Males: 6.3\n\n", maleGPA);
        System.out.println("                                 ");
        System.out.println("                                 ");
        System.out.println("Count of Females: " + femaleCount);
        System.out.printf("GPA of Females: 6.3\n\n", femaleGPA);
        System.out.println("============================================");
    }// display

    public static void main(String[] args) {

        // Making Gpa

        GPA_Data list = new GPA_Data();
        list.readFile();
        list.display();

    }// Main

}// Class
