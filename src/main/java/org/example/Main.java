package org.example;

import org.example.database.DBManager;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Scanner intScanner = new Scanner(System.in);
    static DBManager dbManager = new DBManager();
    static {
        dbManager.createTable("CREATE TABLE IF NOT EXISTS users(id SERIAL PRIMARY KEY, name VARCHAR(255), lastname VARCHAR(255), age INTEGER, email VARCHAR(255), password VARCHAR(255), phoneNumber VARCHAR(255), passportId VARCHAR(255))");
        dbManager.createTable("CREATE TABLE IF NOT EXISTS cards(cardId SERIAL PRIMARY KEY, cardNumber VARCHAR(255), cardPassword VARCHAR(255), cardholderName VARCHAR(255), createDate TIMESTAMP, cardDetail VARCHAR(255), expiryDate TIMESTAMP, user_id BIGINT)");
    }
    public static void main(String[] args) {

<<<<<<< HEAD
=======
                SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

                Session session = sessionFactory.openSession();
                session.beginTransaction();

                User user = User.builder().name("Doniyor").lastname("Khasanov").age(17).email("gmail@doniyor.com").password("googler.dev").build();

                session.save(user);
                session.getTransaction().commit();
                session.close();
                System.out.println("User saved!");


>>>>>>> d09eb34381d28a6febf995e9c3be7de89607e336
    }
}
