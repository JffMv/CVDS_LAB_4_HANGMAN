package hangman.model;

public class BonusScore implements GameScore{
    public int calculateScore(int correctCount, int incorrectCount){
        int count = (correctCount* 10)-(incorrectCount*5);
        int result = (count) < 0 ? 0: count; 
        return result;
    }
}
