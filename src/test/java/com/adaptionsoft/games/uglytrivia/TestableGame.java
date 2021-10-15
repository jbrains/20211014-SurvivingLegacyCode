package com.adaptionsoft.games.uglytrivia;

public class TestableGame extends Game {
    @Override
    protected void reportMessage(String message) {
        // Intentionally do nothing
    }

    @Override
    protected void askQuestion() {
        // Intentionally do nothing
    }

    public int getPlaceOfCurrentPlayer() {
        return super.places[super.currentPlayer];
    }
}
