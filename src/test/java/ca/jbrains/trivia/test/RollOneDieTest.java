package ca.jbrains.trivia.test;

import com.adaptionsoft.games.uglytrivia.TestableGame;
import org.junit.Assert;
import org.junit.Test;

public class RollOneDieTest {
    @Test
    public void iDoNotKnowYet() {
        TestableGame game = new TestableGame();
        game.add("::player 1::");
        game.roll(4);
        Assert.assertEquals(4, game.getPlaceOfCurrentPlayer());
    }
}
