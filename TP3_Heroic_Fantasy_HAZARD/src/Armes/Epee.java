/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author romai
 */
public class Epee extends Arme{
    
    int Finesse;
    
    public Epee(String nom, int niv, int finesse) {
        super(nom, niv);
        
        if(Finesse>100){
            finesse=100;
        }else if(Finesse<0){
            finesse=0;
        }else {
            Finesse =finesse;
        }
    }

    public String getNom() {
        return Nom;
    }

    public int getNiveau() {
        return Niveau;
    }
    
    
    
}
