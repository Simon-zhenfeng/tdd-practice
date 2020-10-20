package tdd.practice;

import static java.lang.String.format;

/**
 * @author Simon
 * @date 2020/10/21 00:04
 */
public class Length {
    private final int amount;
    private final Unit unit;

    public Length(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    private int getInchAmount() {
        return this.amount * unit.transferInchRate;
    }

    public int amount() {
        return amount;
    }

    public Unit unit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return getInchAmount() == length.getInchAmount();
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return format("%d (%s)", amount, unit.display);
    }
}
