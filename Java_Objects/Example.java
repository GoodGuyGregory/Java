
public class Example {
    public static void main(String[] args) {
        System.out.println("Making a new PEZ Dispenser");
        // Creates a New Object
        PezDispenser dispenser = new PezDispenser();
        dispenser.characterName = "Darth Vader";
        // Creates a PezDispenser
        System.out.printf("The dispenser is %s %n", dispenser.characterName);
    }
}