package tdd.practice;

/**
 * @author Simon
 * @date 2020/10/30 23:49
 */
public class Game {
    private int[] rolls = new int[21];
    private int currentIndex = 0;

    public void roll(int number) {
        rolls[currentIndex++] = number;
    }

    public int getScore() {
        int score = 0;
        int rollIndex = 0;
        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {
            if (isSpike(rollIndex)) {
                score += 10 + getSpikeBonus(rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += 10 + getSpareBonus(rollIndex);
                rollIndex += 2;
            } else {
                score += getOneFrameScore(rollIndex);
                rollIndex += 2;
            }
        }
        return score;
    }

    private int getOneFrameScore(int rollIndex) {
        return rolls[rollIndex] + rolls[rollIndex + 1];
    }

    private int getSpareBonus(int rollIndex) {
        return rolls[rollIndex + 2];
    }

    private int getSpikeBonus(int rollIndex) {
        return rolls[rollIndex + 1] + rolls[rollIndex + 2];
    }

    private boolean isSpare(int rollIndex) {
        return getOneFrameScore(rollIndex) == 10;
    }

    private boolean isSpike(int rollIndex) {
        return rolls[rollIndex] == 10;
    }
}
