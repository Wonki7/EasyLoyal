package octamind.dto;

public enum Action {

    ADD ("ADD"),
    SPEND("SPEND");

    private String value;

    Action(String value) {
        this.value = value;
    }
}
