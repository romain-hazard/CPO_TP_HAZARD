/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author romai
 */
public abstract class Personnage {
    String nom; 
    int niveau_vie;
    String Arme_en_Main="NULL";

    public Personnage(String nom, int niveau_vie) {
        this.nom = nom;
        this.niveau_vie = niveau_vie;
    }
    
    
    public void ArmeEq(Arme a){
        for(int i=0; i<5; i++){
            if(a.equals(armes.get(i))){
                Arme_en_Main=armes.getNom(i);
            }
        }
    }
    
    

    public String getArme_en_Main() {
        return Arme_en_Main;
    }
    
 
    @Override
    public String toString() {
        return "Le nom du persoi est "+nom+ " et son niveau de vie "+ niveau_vie;
    }  
    
    private ArrayList<Arme> armes = new ArrayList<>();

    public void equiperArme(String nomArme) {
    boolean trouve = false;

    for (Arme a : armes) {
        if (a.getNom().equals(nomArme)) {
            Arme_en_Main = a;
            System.out.println("Arme équipée : " + nomArme);
            trouve = true;
            break;
        }
    }
    
}

    
}
