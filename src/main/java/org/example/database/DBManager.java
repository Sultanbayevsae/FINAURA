package org.example.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBManager {
    Properties props = new Properties();
    //table yaratish uchun
    public void createTable(String query){
        try(FileInputStream fis = new FileInputStream("src/main/resources/dbres.properties")) {
            props.load(fis);
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");
            try(Connection conn = DriverManager.getConnection(url, user, password)){
                conn.createStatement().executeUpdate(query);
            }catch(SQLException e){
                System.out.println("SQL xatolik " + e.getMessage());
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Faylni topishda xatolik " + e.getMessage());
            e.printStackTrace();
        }
    }

    //table dropping uchun
    public void dropTable(String tableName) {
        try(FileInputStream fis = new FileInputStream("src/main/resources/dbres.properties")) {
            props.load(fis);
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");
            try(Connection conn = DriverManager.getConnection(url, user, password)){
                conn.setAutoCommit(true);
                Statement statement = conn.createStatement();
                statement.executeUpdate("DROP TABLE IF EXISTS " + tableName.toLowerCase());
                System.out.println("Table " + tableName + " o'chirildi");
            }catch(SQLException e){
                System.out.println("SQL xatolik " + e.getMessage());
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Faylni topishda xatolik " + e.getMessage());
            e.printStackTrace();
        }
    }
}
