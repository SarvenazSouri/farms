/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author isi
 */
public class AnimalManager {
    public static ArrayList<Animal> getAllAnimal(int param){
        ArrayList<Animal> listAnimal=new ArrayList<>();
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String urlServeur="jdbc:mariadb://localhost:3310/ferme_bd";
            String identifiant = "root";
            String motDePasse = "Sarvenaz";
            Connection connection = DriverManager.getConnection(urlServeur, identifiant, motDePasse);

            String query = "SELECT * FROM animal WHERE ferme_id=?" ;
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, param);
            
            ResultSet result = preparedStatement.executeQuery();
            
            
            while(result.next()){
                int animal_id = result.getInt("animal_id");
                String nom = result.getString("nom");
                String type = result.getString("type");
                double prix = result.getDouble("prix");

                listAnimal.add(new Animal(animal_id,nom,type,prix));
            }
            
        }
        catch(ClassNotFoundException | SQLException esql){}
        return listAnimal;
    }
}
    
     
    
    
//    public static ArrayList<Animal> getAllAnimal(){
//        ArrayList<Animal> listAnimal = new ArrayList<>();
//         listAnimal.add(new Animal(1,"Cow1","cow",48.50));
//         listAnimal.add(new Animal(2,"Cow2","cow",64.50));
//         listAnimal.add(new Animal(3,"Cow3","cow",61.00));
//         listAnimal.add(new Animal(4,"Cow4","cow",4.50));
//         
//         return listAnimal;
//    }
        
    
    
    
    

