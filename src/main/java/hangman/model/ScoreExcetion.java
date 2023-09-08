package hangman.model;


public class ScoreExcetion extends Exception{

    public static String NEGATIVE_EXCEPTION_SCORE = "THERE ARE NUMBERS NEGATIVE AND DON´T ALLOW";

    public ScoreExcetion(String message){
        super(message);
    }
}
