package praticating;

public enum CarGear {
    FIRST_GEAR("First gear", 1),
    SECOND_GEAR("Second gear", 2),
    THIRD_GEAR("Third gear", 3),
    FOURTH_GEAR("Fourth gear", 4),
    FIFTH_GEAR("Fifth gear", 5),
    REVERSE_GEAR("Reverse gear", -1),
    NEUTRAL("Neutral", 0);

    private final String description;
    private final int numberGear;

    CarGear(String description, int numberGear) {
        this.description = description;
        this.numberGear = numberGear;
    }

    public String getDescription() {
        return this.description;
    }

    public int getNumberGear() {
        return this.numberGear;
    }
}


