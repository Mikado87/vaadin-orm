package ru.amaev.Data.dto;

import java.util.Date;

/**
 * Created by Mikado on 04.01.2018.
 */
public class UserDto implements BaseDto {

    private Long id;

    private String login;

    private String pass;

    private String fio;

    private RoleDto userRole;

    private boolean enabled;


    private Date modificationDate;

    private UserDto lastModificationBy;

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public RoleDto getUserRole() {
        return userRole;
    }

    public void setUserRole(RoleDto userRole) {
        this.userRole = userRole;
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
