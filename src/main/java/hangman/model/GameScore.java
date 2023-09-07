package hangman.model;

import com.google.inject.Inject;

public interface GameScore {
    public int calculateScore(int correctCount,int incorrectCount);
}