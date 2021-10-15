package ca.jbrains.trivia.test;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

public class RollOneDieTest {
    @Test
    public void iDoNotKnowYet() {
        TestableGame game = new TestableGame();
        game.add("::player 1::");
        game.roll(4);
    }

    private static class TestableGame extends Game {
        @Override
        protected void reportMessage(String message) {
            // Intentionally do nothing
        }

        @Override
        protected void askQuestion() {
            // Intentionally do nothing
        }
    }
}
