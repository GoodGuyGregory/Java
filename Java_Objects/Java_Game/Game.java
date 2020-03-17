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

}