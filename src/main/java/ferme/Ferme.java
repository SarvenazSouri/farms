/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ferme;

/**
 *
 * @author isi
 */
public class Ferme {
    private int id_ferme;
    private String nom_ferme;
    private String pays;
    private String name;
    
    public Ferme(int id_ferme,String nom_ferme,String pays,String name){
        this.id_ferme=id_ferme;
        this.nom_ferme=nom_ferme;
        this.pays=pays;
        this.name=name;
    }
     
     public int getId_ferme(){
        return this.id_ferme;
    }
    public String getNom_ferme(){
        return this.nom_ferme;
    }
    public String getPays(){
        return this.pays;
    }
    public String getName(){
        return this.name;
    }
     
}
