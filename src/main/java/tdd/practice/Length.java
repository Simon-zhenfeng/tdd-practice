package tdd.practice;

import static java.lang.String.format;

/**
 * @author Simon
 * @date 2020/10/18 11:21
 */
public class Length {
    private final int amount;
    private final String unit;
    private final int inchAmount;

    public Length(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
        if (unit.equals("foot")) {
            this.inchAmount = amount * 12;
        } else if (unit.equals("yard")) {
            this.inchAmount = amount * 3 * 12;
        } else {
            this.inchAmount = amount;
        }
    }

    public int amount() {
        return amount;
    }

    public String unit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return inchAmount == length.inchAmount;
    }

    @Override
    public int hashCode() {
        return inchAmount;
    }

    @Override
    public String toString() {
        return format("%d (%s)", amount, unit);
    }
}
