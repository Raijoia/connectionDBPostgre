/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancosql;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author 82318841
 */
public class BancoSql {

    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("conf.properties")));
        System.out.println(properties.getProperty("HOST"));
    }
}
