package hangman.model;

public class PowerScore implements GameScore {
    public int calculateScore(int correctCount, int incorrectCount) throws ScoreExcetion{
        if (correctCount < 0 || incorrectCount < 0) throw new ScoreExcetion(ScoreExcetion.NEGATIVE_EXCEPTION_SCORE);
        int count = ((int)Math.pow(5, correctCount))-(incorrectCount*8);
        int result = count < 500 ? count : 500;
        result = (count) < 0 || correctCount == 0 ? 0: count; 
        
        return result;
    }
}
