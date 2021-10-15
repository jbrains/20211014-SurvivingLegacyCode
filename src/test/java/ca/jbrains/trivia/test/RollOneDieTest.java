package ca.jbrains.trivia.test;

import com.adaptionsoft.games.uglytrivia.Game;
import org.junit.Test;

public class RollOneDieTest {
    @Test
    public void iDoNotKnowYet() {
        Game game = new Game() {
            @Override
            protected void reportMessage(String message) {
                // Intentionally do nothing
            }

            @Override
            protected void askQuestion() {
                // Intentionally do nothing
            }
        };
        game.add("::player 1::");
        game.roll(4);
    }
}
