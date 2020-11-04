package tdd.practice;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/11/4 20:58
 */
public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void should_gutter_game() {
        rollMany(20, 0);
        assertThat(game.score()).isEqualTo(0);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void should_get_score_as_20_when_all_roll_ones() {
        rollMany(20, 1);
        assertThat(game.score()).isEqualTo(20);
    }

    @Test
    public void should_score_one_more_when_roll_spare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertThat(game.score()).isEqualTo(16);
    }

    @Test
    public void should_score_two_more_when_roll_strike() {
        rollStrike();
        game.roll(3);
        game.roll(3);
        rollMany(16, 0);
        assertThat(game.score()).isEqualTo(22);
    }

    @Test
    public void should_score_300_when_perfect_game() {
        rollMany(12, 10);
        assertThat(game.score()).isEqualTo(300);
    }

    private void rollStrike() {
        game.roll(10);//strike
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
}
