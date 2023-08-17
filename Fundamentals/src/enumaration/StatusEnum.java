package enumaration;

public enum StatusEnum {
    IN_PREPARATION("In Preparation"),
    IN_TRANSIT("In Transit"),
    DELIVERED("Delivered to Customer");

    private String status;

    private StatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}
