
public class Example {
    public static void main(String[] args) {
        System.out.println("Making a new PEZ Dispenser");
        // Creates a New Object
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("FUN FACT: There are %d PEZ allowed in evert PEZ dispenser %n", PezDispenser.MAX_PEX);
        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is Empty");
        }

        // Creates a PezDispenser
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        System.out.println("Filling the dispenser with delicious PEZ");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

    }
}