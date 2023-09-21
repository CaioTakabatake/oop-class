package inheritance;

public enum FuelEnum {
    GASOLINE("Gasoline"),
    DIESEL("Diesel"),
    ETHANOL("Ethanol"),
    ELECTRIC("Electric"),
    HYBRID("Hybrid");

    private final String fuelType;

    FuelEnum(String typeFuel) {
        this.fuelType = typeFuel;
    }

    public String getFuelType() {
        return fuelType;
    }
}
