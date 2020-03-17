// Creates the PezDispenser Class
class PezDispenser {
    // Class Scope
    // Final is the once and only once method for assigning a PEZ head
    final private String characterName;
    public static final int MAX_PEX = 12;
    private int pezCount;

    // Create Constructor:
    public PezDispenser(String characterName) {
        this.characterName = characterName;
        // Ensures that there is no pez starting out
        pezCount = 0;
    }

    // Method to fill the pez
    public void fill() {
        pezCount = MAX_PEX;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    // Accessor Method:
    public String getCharacterName() {
        // String Contains
        return characterName;
    }// getCharacterName

}