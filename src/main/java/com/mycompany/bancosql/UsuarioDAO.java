/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancosql;

import java.util.Properties;

/**
 *
 * @author 82318841
 */
public class UsuarioDAO {
    private Properties properties;
    
    public UsuarioDAO(Properties properties) {
        this.properties = properties;
    }
    
    public Usuario existe(Usuario u) throws Exception{
//      constructor factory
        var fabrica = new ConnectionFactory(properties);

//      estabelecer a connection

//      Especificar o comando sql

//      Substituir os eventuais placeholders

//      executar o comando

//      mover o cursos, verificando se o usuario existe

//      devolver um objeto usuario, null
    }
}
