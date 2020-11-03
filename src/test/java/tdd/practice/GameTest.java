package tdd.practice;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/11/3 23:29
 */
public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void should_create_game_and_init_the_basic_api() {
        rollMany(20, 0);
        assertThat(game.getScore()).isEqualTo(0);
    }

    private void rollMany(int times, int number) {
        for (int i = 0; i < times; i++) {
            game.roll(number);
        }
    }

    @Test
    public void should_get_total_score_when_all_rolls_are_common() {
        rollMany(20, 1);
        assertThat(game.getScore()).isEqualTo(20);
    }

    @Test
    public void should_get_spike_extra_2_roll_points() {
        rollSpike();
        game.roll(3);
        game.roll(3);
        rollMany(16, 0);
        assertThat(game.getScore()).isEqualTo(22);
    }

    @Test
    public void should_get_spare_extra_1_roll_point() {
        rollSpare();
        game.roll(8);
        rollMany(17, 0);
        assertThat(game.getScore()).isEqualTo(26);
    }

    @Test
    public void should_get_spike_score_when_the_last_frame_is_spike() {
        rollMany(18, 0);
        rollSpike();
        rollMany(2, 6);
        assertThat(game.getScore()).isEqualTo(22);
    }

    @Test
    public void should_get_spike_score_when_the_last_frame_is_spare() {
        rollMany(18, 0);
        rollSpare();
        game.roll(3);
        assertThat(game.getScore()).isEqualTo(13);
    }

    private void rollSpare() {
        game.roll(4);
        game.roll(6);
    }

    private void rollSpike() {
        game.roll(10);
    }
}
