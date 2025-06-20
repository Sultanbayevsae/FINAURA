package org.example;




import org.example.utils.Util;

import java.sql.Connection;

import java.sql.SQLException;


public class Main {


    public static void main(String[] args) throws SQLException {
        Connection connection = Util.dbConnect();
        System.out.println(connection);




    }

}