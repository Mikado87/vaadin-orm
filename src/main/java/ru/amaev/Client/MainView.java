package ru.amaev.Client;

import com.vaadin.addon.jpacontainer.JPAContainer;
import com.vaadin.addon.jpacontainer.JPAContainerFactory;
import com.vaadin.ui.*;
import ru.amaev.Data.EntityManagerBean;
import ru.amaev.Data.dto.UserDto;
import ru.amaev.Data.entities.User;
import ru.amaev.MyUI;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Mikado on 04.01.2018.
 */
public class MainView extends VerticalLayout implements ComponentContainer{



    private TextField login;
    private TextField fio;
    private PasswordField pass;
    private Button button;

    private JPAContainer<User> users;


    public MainView() {
        login = new TextField();
        login.setCaption("Type your login here:");

        fio = new TextField();
        fio.setCaption("Type your fio here:");

        pass = new PasswordField();
        pass.setCaption("Type your pass here:");

        button = new Button("Add User");

        button.addClickListener(e -> {
            addNewUser();


        });

        this.addComponent(login);
        this.addComponent(fio);
        this.addComponent(pass);
        this.addComponent(button);


    }

    private void addNewUser() {
        User user = new User();
        user.setLogin(login.getValue());
        user.setFio(fio.getValue());
        user.setPass(pass.getValue());
//        emb = new EntityManagerBean();
//        emb.addEntity(user);

    }

}
