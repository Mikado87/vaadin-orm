package ru.amaev.Data.dto;

import ru.amaev.Data.enums.RolesEnum;

import java.util.Date;

/**
 * Created by Mikado on 04.01.2018.
 */
public class RoleDto implements BaseDto {

    private Long id;

    private RolesEnum name;

    private boolean enabled;

    private Date modificationDate;

    private UserDto lastModificationBy;

    public RoleDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RolesEnum getName() {
        return name;
    }

    public void setName(RolesEnum name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public UserDto getLastModificationBy() {
        return lastModificationBy;
    }

    public void setLastModificationBy(UserDto lastModificationBy) {
        this.lastModificationBy = lastModificationBy;
    }
}
