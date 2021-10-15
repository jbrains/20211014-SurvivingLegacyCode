package com.adaptionsoft.games.uglytrivia;

public class SinglePlayerGame extends Game {
    public SinglePlayerGame() {
        this(0);
    }

    public SinglePlayerGame(int startingPlaceForFirstPlayer) {
        add("::player 1::");
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