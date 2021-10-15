package com.adaptionsoft.games.uglytrivia;

public class TestableGame extends Game {
    public TestableGame() {
        this(0);
    }

    public TestableGame(int startingPlaceForFirstPlayer) {
        super.places[super.currentPlayer] = startingPlaceForFirstPlayer;
    }

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
