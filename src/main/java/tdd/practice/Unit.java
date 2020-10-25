package tdd.practice;

public enum Unit {
    Inch("inch", 1),
    Foot("foot", 12),
    Yard("yard", 36);


    public final String display;
    public final int transferInchRate;

    Unit(String display, int transferInchRate) {
        this.display = display;
        this.transferInchRate = transferInchRate;
    }
}
