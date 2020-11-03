package tdd.practice;

/**
 * @author Simon
 * @date 2020/11/3 23:31
 */
public class Game {
    private final int[] rolls = new int[21];
    private int currentRollIndex;

    public void roll(int number) {
        rolls[currentRollIndex++] = number;
    }

    public int getScore() {
        int index = 0;
        int score = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isRollSpike(index)) {
                score += 10 + getSpikeExtraScore(index);
                index += 1;
            } else if (isRollSpare(index)) {
                score += 10 + getSpareExtraScore(index);
                index += 2;
            } else {
                score += getOneFrameScore(index);
                index += 2;
            }
        }
        return score;
    }

    private int getSpareExtraScore(int index) {
        return rolls[index + 2];
    }

    private boolean isRollSpare(int index) {
        return getOneFrameScore(index) == 10;
    }

    private int getOneFrameScore(int index) {
        return rolls[index] + rolls[index + 1];
    }

    private int getSpikeExtraScore(int index) {
        return rolls[index + 1] + rolls[index + 2];
    }

    private boolean isRollSpike(int index) {
        return rolls[index] == 10;
    }

}
