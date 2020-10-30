package tdd.practice;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/30 23:48
 */
public class GameTest {

    private Game game;

    @Test
    public void should_create_game() {
        game.roll(0);
        assertThat(game.getScore()).isEqualTo(0);
    }

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void should_get_score_20_when_roll_20_times_with_ball_1() {
        int times = 20;
        int number = 1;
        rollMany(times, number);
        assertThat(game.getScore()).isEqualTo(20);
    }

    private void rollMany(int times, int number) {
        for (int i = 0; i < times; i++) {
            game.roll(number);
        }
    }

    @Test
    public void should_get_extra_one_roll_score_when_roll_a_spare() {
        rollSpare();
        game.roll(6);
        rollMany(17, 0);
        assertThat(game.getScore()).isEqualTo(22);
    }

    @Test
    public void should_get_extra_score_two_rolls_when_roll_a_spike() {
        rollSpike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertThat(game.getScore()).isEqualTo(24);
    }

    private void rollSpike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
}
