/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_hazard;

/**
 *
 * @author romai
 */
public abstract class Personnage {
    int nom; 
    int niveau_vie;

    public Personnage(int nom, int niveau_vie) {
        this.nom = nom;
        this.niveau_vie = niveau_vie;
    }
    
 
    @Override
    public String toString() {
        return "Le nom du persoi est "+nom+ " et son niveau de vie "+ niveau_vie;
    }   
}
