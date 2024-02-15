/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author isi
 */
public class FermeManager {
    public static ArrayList<Ferme> getAllFerme(){
        
        ArrayList<Ferme> listeFerme = new ArrayList<>();
        
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String urlServeur="jdbc:mariadb://localhost:3310/ferme_bd";
            String identifiant = "root";
            String motDePasse = "Sarvenaz";
            Connection connection = DriverManager.getConnection(urlServeur, identifiant, motDePasse);
            
            String query="SELECT * FROM ferme,fermier where fermier.fermier_id=ferme.fermier_id ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet result=preparedStatement.executeQuery();
            
            while(result.next() ){
                int id_ferme=result.getInt("ferme_id");
                String nom_ferme = result.getString("nom_ferme");
                String pays=result.getString("pays");
                String name=result.getString("name");
                
                listeFerme.add(new Ferme (id_ferme,nom_ferme,pays,name));
            }
        }
        catch(ClassNotFoundException | SQLException esql){}
        return listeFerme;
    }
    public static ArrayList<Ferme> getFermeParPays(String param){
        
        ArrayList<Ferme> listeFerme = new ArrayList<>();
        
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String urlServeur="jdbc:mariadb://localhost:3310/ferme_bd";
            String identifiant = "root";
            String motDePasse = "Sarvenaz";
            Connection connection = DriverManager.getConnection(urlServeur, identifiant, motDePasse);
            
            String query="SELECT * FROM ferme,fermier where fermier.fermier_id=ferme.fermier_id and pays=? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,param);
            
            ResultSet result=preparedStatement.executeQuery();
            
            while(result.next() ){
                int id_ferme=result.getInt("ferme_id");
                String nom_ferme = result.getString("nom_ferme");
                String pays=result.getString("pays");
                String name=result.getString("name");
                
                listeFerme.add(new Ferme (id_ferme,nom_ferme,pays,name));
            }
        }
        catch(ClassNotFoundException | SQLException esql){}
        return listeFerme;
    }
    public static ArrayList<Ferme> getFermeParFermier(String param){
        
        ArrayList<Ferme> listeFerme = new ArrayList<>();
        
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String urlServeur="jdbc:mariadb://localhost:3310/ferme_bd";
            String identifiant = "root";
            String motDePasse = "Sarvenaz";
            Connection connection = DriverManager.getConnection(urlServeur, identifiant, motDePasse);
            
            String query="SELECT * FROM ferme,fermier where fermier.fermier_id=ferme.fermier_id and name=? ";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,param);
            
            ResultSet result=preparedStatement.executeQuery();
            
            while(result.next() ){
                int id_ferme=result.getInt("ferme_id");
                String nom_ferme = result.getString("nom_ferme");
                String pays=result.getString("pays");
                String name=result.getString("name");
                
                listeFerme.add(new Ferme (id_ferme,nom_ferme,pays,name));
            }
        }
        catch(ClassNotFoundException | SQLException esql){}
        return listeFerme;
    }
}
