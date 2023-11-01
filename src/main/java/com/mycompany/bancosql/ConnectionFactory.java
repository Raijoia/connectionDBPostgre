/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancosql;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author 82318841
 */
public class ConnectionFactory {
    private String host, port, db, user, password;
    
    public ConnectionFactory(Properties properties) {
        this(
            properties.getProperty("HOST"),
            properties.getProperty("NAME"),
            properties.getProperty("PORT"),
            properties.getProperty("USER"),
            properties.getProperty("PASSWORD")
        );
    }
    
    public ConnectionFactory(String host, String port, String db, String user, String password) {
        this.host = host;
        this.port = port;
        this.db = db;
        this.user = user;
        this.password = password;
    }
    public Connection conectar() throws Exception {
        return DriverManager.getConnection(String.format("jdbc:postgresql://%s:%s/%s", host, port, db), user, password);
    }
    
    public static void main(String[] args) throws Exception{
        var properties = new Properties();
        properties.load(new FileInputStream(new File("db.properties")));
        final String host = properties.getProperty("HOST");
        final String db = properties.getProperty("NAME");
        final String port = properties.getProperty("PORT");
        final String user = properties.getProperty("USER");
        final String password = properties.getProperty("PASSWORD");
        var connection = new ConnectionFactory(host, port, db, user, password);
        
        System.out.println(connection.conectar());
    }
}
