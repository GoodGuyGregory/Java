import java.util.Scanner;

class Prompter {
    private Game game;
    private String guess;

    public Prompter(Game game) {
        // takes a game to prompt to
        this.game = game;
    }

    // Method that Prompts for the guess
    public boolean promptForGuess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter:  ");
        String guessInput = input.nextLine();
        char guess = guessInput.charAt(0);
        return game.applyGuess(guess);
    }
}