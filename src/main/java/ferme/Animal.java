/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferme;

/**
 *
 * @author isi
 */
public class Animal {
    private int animal_id;
    private String nom;
    private double prix;
    private String type;
    
    public Animal(int animal_id,String nom,String type,double prix){
        
        this.animal_id=animal_id;
        this.nom=nom;
        this.prix=prix;
        this.type=type;
    }
    
    public int getAnimal_id(){
        return this.animal_id;
    }
    public String getNom(){
        return this.nom;
    }
    public double getPrix(){
        return this.prix;
    }
    public String getType(){
        return this.type;
    }
}
