/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author romain
 */
public class Magicien extends Personnage {
    
    boolean confirme; 
    
    public Magicien(String nom, int niveau_vie, boolean confirme) {
        super(nom, niveau_vie);
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
}
