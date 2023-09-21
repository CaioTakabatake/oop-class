package inheritance;

public enum TransmissionEnum {
    AUTOMATIC("Automatic"),
    MANUAL("Manual"),
    SEMI_AUTOMATIC("Semi-Automatic"),
    CVT("Continuously Variable Transmission"),
    DCT("Dual-Clutch Transmission");

    private final String typeTransmission;

    TransmissionEnum(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }
}
