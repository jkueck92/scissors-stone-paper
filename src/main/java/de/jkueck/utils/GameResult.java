package de.jkueck.utils;

public class GameResult {

    private int winCountBot1 = 0;

    private int winCountBot2 = 0;

    private int undecidedCount = 0;

    public int getWinCountBot1() {
        return winCountBot1;
    }

    public int getWinCountBot2() {
        return winCountBot2;
    }

    public int getUndecidedCount() {
        return undecidedCount;
    }

    public void addWinCountBot1() {
        this.winCountBot1++;
    }

    public void addWinCountBot2() {
        this.winCountBot2++;
    }

    public void addUndecidedCount() {
        this.undecidedCount++;
    }

    public Boolean isBot1TheWinner() {
        if (this.winCountBot1 > this.winCountBot2) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
