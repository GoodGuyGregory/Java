import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
			// __Name__ is a __adjective__ __noun__ They are always __adverb__ __verb__
			//Parse String with parseInt 
			String ageAsString = console.readLine("What is your age? ");
			//Integer is a wrapper and int is the primarimative data type.
			
			int age = Integer.parseInt(ageAsString);
			if (age < 13) {
				//adding exit code for Pg-13 quality
				console.printf("Sorry Bud..\nYou must be at least 13 to use the program..\n");
				//quits the program
				System.exit(0);
			}
			String name = console.readLine("Enter your name: ");
			String adjective = console.readLine("Enter an adjective: ");
			//create a Do -while loop
			String noun;
			do {
				 noun = console.readLine("Enter an noun: ");
				// some Sensorship ignoring case.
				if (noun.equalsIgnoreCase("jerk") ||
						noun.equalsIgnoreCase("nerd")||
						noun.equalsIgnoreCase("butthead")||
						noun.equalsIgnoreCase("douche") ||
						noun.equalsIgnoreCase("slut") ||
					 noun.equalsIgnoreCase("hoe")){
					console.printf("That language us not appropriate..\n Try again.\n");
					
					}//if
				//do-while
				} while(noun.equalsIgnoreCase("jerk") ||
				        noun.equalsIgnoreCase("nerd")||
						    noun.equalsIgnoreCase("butthead")||
						    noun.equalsIgnoreCase("douche") ||
						    noun.equalsIgnoreCase("slut") ||
					      noun.equalsIgnoreCase("hoe"));		
			String adverb = console.readLine("Enter an adverb: ");
			String verb = console.readLine("Enter an verb endig in -ing: ");
			
			console.printf("Your story: \n---------------------\n");
			console.printf("%s is a %s %s ,", name, adjective, noun); 
			console.printf(" they are always %s %s.", adverb, verb);
			console.printf("\n---------------------\n");
    }
    
}