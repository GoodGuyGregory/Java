import java.io.Console;
 
public class Introductions {
  
   
	 public static void main(String[] args) {
		    //Creates Object with a name console
		 
     		Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
        String firstName = console.readLine("What is your name? ");
        //thisIsAnExampleOfCamelCasing
        console.printf("Hello, my name is %s\n", firstName);
        console.printf("%s is learning how to write Java\n", firstName);
  }
}