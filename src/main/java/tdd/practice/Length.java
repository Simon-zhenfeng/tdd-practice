package tdd.practice;

import static java.lang.String.format;

/**
 * @author Simon
 * @date 2020/10/18 11:21
 */
public class Length {
    private final int amount;
    private final Unit unit;

    public Length(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    private int getInchAmount() {
        return unit.getInchAmount(amount);
    }

    public int amount() {
        return amount;
    }

    public String unit() {
        return unit.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return getInchAmount() == length.getInchAmount();
    }

    @Override
    public String toString() {
        return format("%d (%s)", amount, unit.getName());
    }
}
