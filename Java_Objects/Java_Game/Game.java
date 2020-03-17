class Game {
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer;
        hits = "";
        misses = "";
    }

    public boolean applyGuess(char letter) {
        // if the index is greater than -1 it is a part
        // of the answer and therefore a hit
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        } else {
            // adds to the letters of misses
            misses += letter;
        }
        return isHit;
    }

    // Checks weather the letter is
    public String getCurrentProgress() {
        String progress = "";
        for (char letter : answer.toCharArray()) {
            char display = '-';
            // if letter is found from the "hits" array
            if (hits.indexOf(letter) != -1) {
                // add the letter to the display
                // at that letter location
                display = letter;
            }
            progress += display;
        }
        // pass the display mesage to the prompter
        return progress;
    }

}