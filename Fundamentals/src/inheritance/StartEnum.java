package inheritance;

public enum StartEnum {
    ELECTRIC_START("Electric Start"),
    KICK_START("Kick Start"),
    PUSH_START("Push Start"),
    REMOTE_START("Remote Start");

    private final String type;

    StartEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
