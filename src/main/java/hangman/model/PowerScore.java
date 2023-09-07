package hangman.model;

public class PowerScore implements GameScore {
    public int calculateScore(int correctCount, int incorrectCount){
        int count = ((int)Math.pow(5, correctCount))-(incorrectCount*8);
        int result = (count) < 0 || correctCount == 0 ? 0: count; 
        result = count < 500 ? 500 : count;
        return result;
    }
}
