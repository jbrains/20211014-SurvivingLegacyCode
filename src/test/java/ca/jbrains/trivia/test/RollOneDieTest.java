package ca.jbrains.trivia.test;

import com.adaptionsoft.games.uglytrivia.SinglePlayerGame;
import org.junit.Assert;
import org.junit.Test;

public class RollOneDieTest {
    @Test
    public void currentPlayerMovesCorrectly_Four() {
        SinglePlayerGame game = new SinglePlayerGame(0);
        game.roll(4);
        Assert.assertEquals(4, game.getPlaceOfCurrentPlayer());
    }

    @Test
    public void currentPlayerMovesCorrectly_Eleven() {
        SinglePlayerGame game = new SinglePlayerGame(0);
        game.roll(11);
        Assert.assertEquals(11, game.getPlaceOfCurrentPlayer());
    }

    @Test
    public void currentPlayerMovesCorrectly_AroundTheBoard() {
        SinglePlayerGame game = new SinglePlayerGame(0);
        game.roll(12);
        Assert.assertEquals(0, game.getPlaceOfCurrentPlayer());
    }
}
