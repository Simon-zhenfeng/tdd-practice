package tdd.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/18 11:19
 */
public class LengthTest {
    @Test
    public void should_create_length_with_amount_and_unit() {
        Length inch = new Length(1, Unit.inch);
        assertThat(inch.amount()).isEqualTo(1);
        assertThat(inch.unit()).isEqualTo("inch");
    }

    @Test
    public void should_1_inch_equal_to_1_inch() {
        Length inch = new Length(1, Unit.inch);
        assertThat(inch).isEqualTo(new Length(1, Unit.inch));
    }

    @Test
    public void should_display_inner_info_format() {
        assertThat(new Length(1, Unit.inch).toString()).isEqualTo("1 (inch)");
    }

    @Test
    public void should_1_foot_equal_to_12_inchs() {
        assertThat(new Length(1, Unit.foot))
                .isEqualTo(new Length(12, Unit.inch));
    }

    @Test
    public void should_1_yard_equal_to_3_feet() {
        assertThat(new Length(1, Unit.yard))
                .isEqualTo(new Length(3, Unit.foot));
    }

    @Test
    public void should_1_yard_equal_to_36_inchs() {
        assertThat(new Length(1, Unit.yard))
                .isEqualTo(new Length(36, Unit.inch));
    }
}
