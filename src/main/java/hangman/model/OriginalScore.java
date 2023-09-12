package hangman.model;

public class OriginalScore implements GameScore {
    
    
    public int calculateScore(int correctCount, int incorrectCount) throws ScoreExcetion{
        if (correctCount < 0 || incorrectCount < 0) throw new ScoreExcetion(ScoreExcetion.NEGATIVE_EXCEPTION_SCORE);
        int count = 100-(incorrectCount*10);
        int result = (count) < 0 ? 0: count; 
        return result;
    }
}
