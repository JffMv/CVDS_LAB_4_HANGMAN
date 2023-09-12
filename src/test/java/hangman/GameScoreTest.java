package hangman;
import org.junit.Assert;
import org.junit.Test;
import hangman.model.*;



public class GameScoreTest {

    /**
     * The next four proofs, made focus in boundaries of Original Score.
     evaled: 
     * negatives
     * start whit score in 100 and not agree points whit the correct answers 
     * value minimum is 0
     * penalty whith 10 points
     */
    @Test
    public void validateInputsNegativesOriginal() {
        try{
        GameScore play = new OriginalScore();
        int resultNum = play.calculateScore(-20, -100);
        Assert.assertTrue(false);
    }
        catch(ScoreExcetion e){
            Assert.assertTrue(true);
        }
        
    }

    @Test
    public void validateInputsMoreOnehundredOriginal() {
        try{
        GameScore play = new OriginalScore();
        int resultNum = play.calculateScore(200, 0);
        Assert.assertEquals(100, resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

    @Test
    public void validateMinZeroOriginal() {
        try{
        GameScore play = new OriginalScore();
        int resultNum = play.calculateScore(20, 100);
        Assert.assertEquals(0, resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

    @Test
    public void validateLowTenOriginal() {
        try{
        GameScore play = new OriginalScore();
        int resultNum = play.calculateScore(20, 1);
        Assert.assertEquals(90, resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

//------------------------------------------------------
    /**
     * The next five proofs, made focus in boundaries of Bonus Score.
     evaled: 
     * negatives
     * start whit score in 0
     * given ten points for each correct answer
     * penalty whith 5 points
     * value minimum is 0
     */
    @Test
    public void validateInputsNegativesBonus() {
        try{
        GameScore play = new BonusScore();
        int resultNum = play.calculateScore(-20, -100);
        Assert.assertTrue(false);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(true);
        }
        
    }

    @Test
    public void validateStartZeroBonus() {
        try{
        GameScore play = new BonusScore();
        int resultNum = play.calculateScore(0, 0);
        Assert.assertEquals(0,resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

    @Test
    public void validateBonusTenBonus() {
        try{
        GameScore play = new BonusScore();
        int resultNum = play.calculateScore(1, 0);
        Assert.assertEquals(10,resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }
    @Test
    public void validatePenalFiveBonus() {
        try{
        GameScore play = new BonusScore();
        int resultNum = play.calculateScore(1, 1);
        Assert.assertEquals(5,resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

    @Test
    public void validateScoreMinBonus() {
        try{
        GameScore play = new BonusScore();
        int resultNum = play.calculateScore(1, 100);
        Assert.assertEquals(0,resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }



//------------------------------------------------------
    /**
     * The next five proofs, made focus in boundaries of Power Score.
     evaled: 
     * negatives
     * start whit score in 0
     * given 5^i points for each correct answer(i)
     * penalty whith 8 points
     * value minimum is 0
     */
    @Test
    public void validateInputsNegativesPower() {
        try{
        GameScore play = new PowerScore();
        int resultNum = play.calculateScore(-20, -100);
        Assert.assertTrue(false);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(true);
        }
        
    }

    @Test
    public void validateStartZeroPower() {
        try{
        GameScore play = new PowerScore();
        int resultNum = play.calculateScore(0, 0);
        Assert.assertEquals(0,resultNum);
        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
    }

    @Test
    public void validateBonus_5_i_Power() {
        try{
        GameScore play = new PowerScore();
        int resultNum = play.calculateScore(1, 0);
        int resultNum2 = play.calculateScore(3, 0);
        Assert.assertEquals(5,resultNum);
        Assert.assertEquals(125,resultNum2);

        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

    @Test
    public void validatePenalEightPower() {
        try{
        GameScore play = new PowerScore();
        int resultNum = play.calculateScore(2, 2);
        int resultNum2 = play.calculateScore(2, 1);
        Assert.assertEquals(9,resultNum);
        Assert.assertEquals(17,resultNum2);

        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }

    @Test
    public void validateMinPower() {
        try{
        GameScore play = new PowerScore();
        int resultNum = play.calculateScore(2, 20);
        int resultNum2 = play.calculateScore(1, 1);
        Assert.assertEquals(0,resultNum);
        Assert.assertEquals(0,resultNum2);

        }
        catch(ScoreExcetion e){
            Assert.assertTrue(false);
        }
        
    }
    
}
