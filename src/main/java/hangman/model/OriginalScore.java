package hangman.model;

public class OriginalScore implements GameScore {
    
    public int calculateScore(int correctCount, int incorrectCount){
        int count = 100-(incorrectCount*10);
        int result = (count) < 0 ? 0: count; 
        return result;
    }
}
