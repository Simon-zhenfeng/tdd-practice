package tdd.practice;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Simon
 * @date 2020/10/17 23:45
 */
public class LengthTest {
    @Test
    public void should_create_inch_object() {
        Length inch = new Length(1, "inch");
        assertThat(inch).isNotNull();
        assertThat(inch.unit()).isEqualTo("inch");
    }

    @Test
    public void should_1_inch_equal_to_1_inch() {
        assertThat(new Length(1, "inch")).isEqualTo(new Length(1, "inch"));
    }

    @Test
    public void should_not_1_inch_equal_to_1_foot() {
        assertThat(new Length(1, "inch")).isNotEqualTo(new Length(1, "foot"));
    }

    @Test
    public void should_display_internal_info_friendly() {
        assertThat(new Length(1, "inch").toString()).isEqualTo("1 (inch)");
        assertThat(new Length(1, "foot").toString()).isEqualTo("1 (foot)");
    }

    @Test
    public void should_1_foot_equal_to_12_inchs() {
        assertThat(new Length(1, "foot")).isEqualTo(new Length(12, "inch"));
    }

    @Test
    public void should_1_yard_equal_to_3_feet() {
        assertThat(new Length(1, "yard")).isEqualTo(new Length(3, "foot"));
    }

    @Test
    public void should_1_yard_equal_to_36_inchs() {
        assertThat(new Length(1, "yard")).isEqualTo(new Length(36, "inch"));
    }
}
