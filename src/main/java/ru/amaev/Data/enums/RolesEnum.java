package ru.amaev.Data.enums;

/**
 * Created by Mikado on 25.12.2017.
 */
public enum RolesEnum {
    ADMIN("admin"),
    USER("user")
    ;

    private String value;

    RolesEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
