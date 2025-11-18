/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author romai
 */
public abstract class Arme {
    String Nom; 
    int Niveau; 
    
    public Arme(String nom, int niv){
        Nom=nom;
        
        if (Niveau>100){
            niv=100;
        }else if(Niveau<0){
            niv=0;
        }else{ 
            Niveau=niv;
        }
    }

    public String getNom() {
        return Nom;
    }

    public int getNiveau() {
        return Niveau;
    }
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Son nom est : " +Nom +" et son niveau : "+ Niveau;
    }
}
