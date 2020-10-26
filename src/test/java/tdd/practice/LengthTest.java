package tdd.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/26 23:59
 */
public class LengthTest {
    @Test
    public void should_create_length_with_amount_and_unit() {
        Length length = new Length(1, Unit.Inch);
        assertThat(length.amount()).isEqualTo(1);
        assertThat(length.unit()).isEqualTo(Unit.Inch);
    }

    @Test
    public void should_1_inch_equal_to_1_inch() {
        assertThat(new Length(1, Unit.Inch)).isEqualTo(new Length(1, Unit.Inch));
    }

    @Test
    public void should_display_length_info_format() {
        assertThat(new Length(1, Unit.Inch).toString()).isEqualTo("1 (inch)");
    }

    @Test
    public void should_1_foot_equal_to_12_inches() {
        assertThat(new Length(1, Unit.Foot)).isEqualTo(new Length(12, Unit.Inch));
    }

    @Test
    public void should_1_yard_equal_to_3_feet() {
        assertThat(new Length(1, Unit.Yard)).isEqualTo(new Length(3, Unit.Foot));
    }

    @Test
    public void should_1_yard_equal_to_36_inches() {
        assertThat(new Length(1, Unit.Yard)).isEqualTo(new Length(36, Unit.Inch));
    }
}
