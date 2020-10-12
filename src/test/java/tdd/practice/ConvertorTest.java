package tdd.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/13 00:07
 */
public class ConvertorTest {
    @Test
    public void should_get_12_inch_when_input_1_foot() {
        Length foot = new Length(1, "foot");
        Length inch = foot.convertTo("inch");
        assertThat(inch).isNotNull();
        assertThat(inch.unit()).isEqualTo(Unit.INCH);
        assertThat(inch.value()).isEqualTo(12);
    }
    @Test
    public void should_get_24_inch_when_input_2_foot() {
        Length foot = new Length(2, "foot");
        Length inch = foot.convertTo("inch");
        assertThat(inch).isNotNull();
        assertThat(inch.unit()).isEqualTo(Unit.INCH);
        assertThat(inch.value()).isEqualTo(24);
    }
    @Test
    public void should_get_3_foot_when_input_1_yard() {
        Length yard = new Length(1, "yard");
        Length foot = yard.convertTo("foot");
        assertThat(foot).isNotNull();
        assertThat(foot.unit()).isEqualTo(Unit.FOOT);
        assertThat(foot.value()).isEqualTo(3);
    }
    @Test
    public void should_get_36_inch_when_input_1_yard() {
        Length yard = new Length(1, "yard");
        Length inch = yard.convertTo("inch");
        assertThat(inch).isNotNull();
        assertThat(inch.unit()).isEqualTo(Unit.INCH);
        assertThat(inch.value()).isEqualTo(36);
    }
}
