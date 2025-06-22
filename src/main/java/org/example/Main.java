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

    }
}