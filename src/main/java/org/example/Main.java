package org.example;

import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;;

public class Main {
    public static void main(String[] args) {

                SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

                Session session = sessionFactory.openSession();
                session.beginTransaction();

                User user = new User();
                user.setName("Ali");

                session.save(user);
                session.getTransaction().commit();
                session.close();

                System.out.println("User saved!");


    }
}