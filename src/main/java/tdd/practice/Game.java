package tdd.practice;

/**
 * @author Simon
 * @date 2020/11/4 21:00
 */
public class Game {
    private final int[] rolls = new int[21];
    private int currentRoll;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int index = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rolls[index])) {
                score += 10 + strikeBonus(index);
                index += 1;
            }else if (isSpare(index)) {
                score += 10 + spareBonus(index);
                index += 2;
            } else {
                score += oneFrameScore(index);
                index += 2;
            }
        }
        return score;
    }

    private int oneFrameScore(int index) {
        return rolls[index] + rolls[index + 1];
    }

    private int spareBonus(int index) {
        return rolls[index + 2];
    }

    private int strikeBonus(int index) {
        return rolls[index + 1] + rolls[index + 2];
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }

    private boolean isSpare(int index) {
        return oneFrameScore(index) == 10;
    }
}
