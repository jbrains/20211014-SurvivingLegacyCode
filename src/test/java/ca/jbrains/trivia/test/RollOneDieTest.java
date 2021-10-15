package ca.jbrains.trivia.test;

import com.adaptionsoft.games.uglytrivia.TestableGame;
import org.junit.Assert;
import org.junit.Test;

public class RollOneDieTest {
    @Test
    public void currentPlayerMovesCorrectly_Four() {
        TestableGame game = new TestableGame(0);
        game.add("::player 1::");
        game.roll(4);
        Assert.assertEquals(4, game.getPlaceOfCurrentPlayer());
    }

    @Test
    public void currentPlayerMovesCorrectly_Eleven() {
        TestableGame game = new TestableGame(0);
        game.add("::player 1::");
        game.roll(11);
        Assert.assertEquals(11, game.getPlaceOfCurrentPlayer());
    }

    @Test
    public void currentPlayerMovesCorrectly_AroundTheBoard() {
        TestableGame game = new TestableGame(0);
        game.add("::player 1::");
        game.roll(12);
        Assert.assertEquals(0, game.getPlaceOfCurrentPlayer());
    }
}
