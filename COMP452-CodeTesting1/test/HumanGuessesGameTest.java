import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class HumanGuessesGameTest {

    @Test
    void makeLowGuess() {
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 500;
        GuessResult expected = GuessResult.LOW;
        GuessResult actual;

        actual = hgg.makeGuess(value);
        assertEquals(actual,expected);
    }
    @Test
    void makeCorrectGuess(){
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 783;
        GuessResult expected = GuessResult.CORRECT;
        GuessResult actual;

        actual = hgg.makeGuess(value);
        assertEquals(actual,expected);
    }

    @Test
    void makeHighGuess(){
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 999;
        GuessResult expected = GuessResult.HIGH;
        GuessResult actual;

        actual = hgg.makeGuess(value);
        assertEquals(actual,expected);
    }

    @Test
    void getThreeGuesses() {
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 999;
        int expected = 3;
        int wrong = 2;
        int actual;
        hgg.makeGuess(value);
        hgg.makeGuess(value);
        hgg.makeGuess(value);

        actual = hgg.getNumGuesses();
        assertEquals(actual, expected);
        assertNotEquals(wrong, actual);
    }

    @Test
    void getNoGuesses() {
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int expected = 0;
        int wrong = 2;
        int actual;

        actual = hgg.getNumGuesses();
        assertEquals(actual, expected);
        assertNotEquals(wrong, actual);
    }

    @Test
    void getOneGuess() {
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 999;
        int expected = 1;
        int actual;
        hgg.makeGuess(value);

        actual = hgg.getNumGuesses();
        assertEquals(actual, expected);
    }



    @Test
    void isNotDone() {
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 999;
        boolean expected = false;
        boolean actual;
        hgg.makeGuess(value);

        actual = hgg.isDone();
        assertEquals(actual, expected);
    }

    @Test
    void isDone() {
        DoubleHumanGuessesGame hgg = new DoubleHumanGuessesGame();
        int value = 783;
        boolean expected = true;
        boolean actual;
        hgg.makeGuess(value);

        actual = hgg.isDone();
        assertEquals(actual, expected);
    }

}