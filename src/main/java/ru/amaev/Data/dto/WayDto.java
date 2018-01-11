package ru.amaev.Data.dto;

import java.util.Date;

/**
 * Created by Mikado on 04.01.2018.
 */
public class WayDto implements BaseDto {

    private Long id;

    private String name;

    private Date start;

    private Date finish;

    private boolean enabled;

    private Date modificationDate;

    private UserDto lastModificationBy;

    public WayDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
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
