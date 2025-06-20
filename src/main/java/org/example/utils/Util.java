package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Util {

    private static  final ResourceBundle bundle = ResourceBundle.getBundle("DB");
    private static final String url = bundle.getString("Url");
    private static final String username = bundle.getString("User");
    private static final String password = bundle.getString("Password");

    public static Connection dbConnect() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("create table if not exists users(id serial primary key , name varchar(100),lastname varchar(100),age int , email varchar(100), password varchar(100),phone_number varchar(100),passport_id varchar(100));" +
                                                                              " create table if not exists cards(card_id serial primary key , card_number varchar(100) not null unique ,card_password int,cardholder_name varchar(100) , create_date timestamp, card_type varchar(100),expiry_date timestamp, user_id INTEGER references users(id) )");
            preparedStatement.executeUpdate();
            return connection;

        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
