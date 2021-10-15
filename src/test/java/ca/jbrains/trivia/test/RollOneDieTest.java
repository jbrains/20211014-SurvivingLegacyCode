package ca.jbrains.trivia.test;

import com.adaptionsoft.games.uglytrivia.SilentSinglePlayerGame;
import org.junit.Assert;
import org.junit.Test;

public class RollOneDieTest {
    @Test
    public void currentPlayerMovesCorrectly_Four() {
        SilentSinglePlayerGame game = new SilentSinglePlayerGame(0);
        game.roll(4);
        Assert.assertEquals(4, game.getPlaceOfCurrentPlayer());
    }

    @Test
    public void currentPlayerMovesCorrectly_Eleven() {
        SilentSinglePlayerGame game = new SilentSinglePlayerGame(0);
        game.roll(11);
        Assert.assertEquals(11, game.getPlaceOfCurrentPlayer());
    }

    @Test
    public void currentPlayerMovesCorrectly_AroundTheBoard() {
        SilentSinglePlayerGame game = new SilentSinglePlayerGame(0);
        game.roll(12);
        Assert.assertEquals(0, game.getPlaceOfCurrentPlayer());
    }
}
