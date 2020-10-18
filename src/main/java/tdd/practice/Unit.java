package tdd.practice;

public enum Unit {
    INCH(1),
    FOOT(12),
    YARD(36);

    private final int transferToInchRate;

    Unit(int transferToInchRate) {
        this.transferToInchRate = transferToInchRate;
    }

    public String displayName() {
        return name().toLowerCase();
    }

    public int getInchAmount(int amount) {
        return amount * transferToInchRate;
    }
}
