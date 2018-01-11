package ru.amaev.Data.entities;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * Created by Mikado on 25.12.2017.
 */
@Entity
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "users")
public class User implements BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column
    @Basic(optional = false)
    private String login;

    @Column
    @Basic(optional = false)
    private String pass;

    @Column
    private String fio;

    @ManyToOne(targetEntity = Role.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "userRole", nullable = true)
    private Role userRole;

    @Column
    private Boolean enabled;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_date", nullable = true)
    private Date modificationDate;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "last_modified_by", nullable = true)
    private User lastModificationBy;

    public User() {
    }

    @PrePersist
    @PreUpdate
    private void prePersist() {
        this.setModificationDate(new Date());
        if (this.enabled == null) {
            this.enabled = true;
        }
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

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public User getLastModificationBy() {
        return lastModificationBy;
    }

    public void setLastModificationBy(User lastModificationBy) {
        this.lastModificationBy = lastModificationBy;
    }
}
