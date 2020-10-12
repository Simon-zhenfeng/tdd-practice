package tdd.practice;

/**
 * @author Simon
 * @date 2020/10/13 00:17
 */
public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, String unitString) {
        this.value = value;
        this.unit = Unit.valueOf(unitString.toUpperCase());
    }

    public Length convertTo(String unitString) {
        double newValue = 0;
        if (Unit.INCH.name().equals(unitString.toUpperCase()) && unit == Unit.FOOT) {
            newValue = value * 12;
        }
        if (Unit.INCH.name().equals(unitString.toUpperCase()) && unit == Unit.YARD) {
            newValue = value * 36;
        }
        if (Unit.FOOT.name().equals(unitString.toUpperCase())) {
            newValue = value * 3;
        }
        return new Length(newValue, unitString.toUpperCase());
    }

    public Unit unit() {
        return this.unit;
    }

    public double value() {
        return value;
    }
}
