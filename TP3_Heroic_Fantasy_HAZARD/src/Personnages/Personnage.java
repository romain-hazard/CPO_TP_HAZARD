/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author romai
 */
public abstract class Personnage {
    String nom; 
    int niveau_vie;

    public Personnage(String nom, int niveau_vie) {
        this.nom = nom;
        this.niveau_vie = niveau_vie;
    }
    
 
    @Override
    public String toString() {
        return "Le nom du persoi est "+nom+ " et son niveau de vie "+ niveau_vie;
    }   
}
