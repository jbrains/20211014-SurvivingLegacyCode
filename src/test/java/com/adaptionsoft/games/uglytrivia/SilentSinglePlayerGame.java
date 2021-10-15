package com.adaptionsoft.games.uglytrivia;

public class SilentSinglePlayerGame extends Game {
    public SilentSinglePlayerGame() {
        this(0);
    }

    public SilentSinglePlayerGame(int startingPlaceForFirstPlayer) {
        super(new ReportMessage() {
            @Override
            public void reportMessage(String message) {
                // Intetionally do nothing
            }
        });
        add("::player 1::");
        super.places[super.currentPlayer] = startingPlaceForFirstPlayer;
    }

    @Override
    protected void askQuestion() {
        // Intentionally do nothing
    }

    public int getPlaceOfCurrentPlayer() {
        return super.places[super.currentPlayer];
    }
}
