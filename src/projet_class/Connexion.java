/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rata
 */
public class Connexion {
    
    
    String urlPilote="com.mysql.cj.jdbc.Driver";
    String urlBaseDonnees="jdbc:mysql://localhost:3306/projetjava?";
    Connection con;
    
    public Connexion(){
        
        try{
            Class.forName(urlPilote);
            System.out.println("chargement du pilote reussie");
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
            try{
                con = DriverManager.getConnection(urlBaseDonnees, "root", "");
                System.out.println("connection a la base de donné reussie");
            }
            catch(SQLException ex){
                System.out.println(ex);
            }
    }
    Connection ObtenirConnexion(){
        return con;
    }
    
    
}

    

