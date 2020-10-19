package tdd.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tdd.practice.Unit.*;

/**
 * @author Simon
 * @date 2020/10/19 23:34
 */
public class LengthTest {
    @Test
    public void should_create_length_with_amount_and_unit() {
        Length inch = new Length(1, Inch);
        assertThat(inch.amount()).isEqualTo(1);
        assertThat(inch.unit()).isEqualTo(Inch);
    }

    @Test
    public void should_1_inch_equal_to_1_inch() {
        assertThat(new Length(1, Inch)).isEqualTo(new Length(1, Inch));
    }

    @Test
    public void should_display_length_format() {
        assertThat(new Length(1, Inch).toString()).isEqualTo("1 (inch)");
    }

    @Test
    public void should_1_foot_equal_to_12_inches() {
        assertThat(new Length(1, Foot)).isEqualTo(new Length(12, Inch));
    }

    @Test
    public void should_1_yar_equal_to_3_feet() {
        assertThat(new Length(1, Yard)).isEqualTo(new Length(3, Foot));
    }

    @Test
    public void should_1_yard_equal_to_36_inches() {
        assertThat(new Length(1, Yard)).isEqualTo(new Length(36, Inch));
    }
}
