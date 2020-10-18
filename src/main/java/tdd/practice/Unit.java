package tdd.practice;

public enum Unit {
    INCH("inch", 1),
    FOOT("foot", 12),
    YARD("yard", 36);

    private final String display;
    public final int transferToInchRate;

    Unit(String display, int transferToInchRate) {
        this.display = display;
        this.transferToInchRate = transferToInchRate;
    }

    public String display() {
        return display;
    }
}
