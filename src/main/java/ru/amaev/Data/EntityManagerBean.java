package ru.amaev.Data;

import ru.amaev.Data.entities.BaseEntity;
import ru.amaev.Data.entities.User;

import javax.ejb.*;
import javax.persistence.*;
import javax.transaction.Transactional;

/**
 * Created by Mikado on 04.01.2018.
 */
@Stateful
@Transactional
@Local
@Startup
public class EntityManagerBean {

    @PersistenceContext(type = PersistenceContextType.EXTENDED, unitName = "wttmPool")
    EntityManager em;

    @PersistenceUnit(unitName = "wttmPool")
    EntityManagerFactory emf;

    @PostLoad
    public void addEntity () {
        User usr = new User();
        usr.setLogin("mikado");
        usr.setFio("Amaev Michael");
        usr.setPass("odakim");
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("wttmPool");
        }
        EntityManager em = emf.createEntityManager();

        User user = em.find(User.class,1L);
        em.persist(usr);
//        em.flush();
    }

}
