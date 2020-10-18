package tdd.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tdd.practice.Unit.*;

/**
 * @author Simon
 * @date 2020/10/18 13:30
 */
public class LengthTest {
    @Test
    public void should_create_length_with_amount_and_unit() {
        Length length = new Length(1, INCH);
        assertThat(length.amount()).isEqualTo(1);
        assertThat(length.unit()).isEqualTo(INCH);
    }

    @Test
    public void should_1_inch_equal_to_1_inch() {
        assertThat(new Length(1, INCH)).isEqualTo(new Length(1, INCH));
    }

    @Test
    public void should_display_length_info_format() {
        assertThat(new Length(1, INCH).toString()).isEqualTo("1 (inch)");
    }

    @Test
    public void should_1_foot_equal_to_12_inch() {
        assertThat(new Length(1, FOOT)).isEqualTo(new Length(12, INCH));
    }

    @Test
    public void should_1_yard_equal_to_3_feet() {
        assertThat(new Length(1, YARD)).isEqualTo(new Length(3, FOOT));
    }

    @Test
    public void should_1_yard_equal_to_36_inches() {
        assertThat(new Length(1, YARD)).isEqualTo(new Length(36, INCH));
    }
}
