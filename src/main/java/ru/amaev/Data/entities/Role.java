package ru.amaev.Data.entities;


import org.hibernate.annotations.CacheConcurrencyStrategy;
import ru.amaev.Data.enums.RolesEnum;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Mikado on 25.12.2017.
 */
@Entity
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
@Table(name = "roles")
public class Role implements BaseEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated
    private RolesEnum name;

    @Column
    private Boolean enabled;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modification_date", nullable = false)
    private Date modificationDate;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "last_modified_by", nullable = false)
    private User lastModificationBy;

    public Role() {
    }

    @PrePersist
    @PreUpdate
    private void prePersist() {
        this.setModificationDate(new Date());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getLastModificationBy() {
        return lastModificationBy;
    }

    public void setLastModificationBy(User lastModificationBy) {
        this.lastModificationBy = lastModificationBy;
    }

    public RolesEnum getName() {
        return name;
    }

    public void setName(RolesEnum name) {
        this.name = name;
    }
}
