package tdd.practice;

/**
 * @author Simon
 * @date 2020/10/18 12:00
 */
public enum Unit {
    foot("foot", 12),
    yard("yard", 36),
    inch("inch", 1);

    private final String name;
    private final int transferRateToInch;

    Unit(String name, int transferRateToInch) {
        this.name = name;
        this.transferRateToInch = transferRateToInch;
    }

    public String getName() {
        return name;
    }

    public int getInchAmount(int amount) {
        return amount * this.transferRateToInch;
    }
}
