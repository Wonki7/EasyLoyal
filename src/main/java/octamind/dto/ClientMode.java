package octamind.dto;

public enum ClientMode {

    GOLD("GOLD"),
    SILVER("SILVER"),
    OIL("OIL"),
    BANNED("BANNED");

    private String value;

    private ClientMode(String value) {this.value = value;}

}
