/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_hazard;

/**
 *
 * @author romai
 */
public class Voiture {

    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;

    public Voiture(String Mod, String Mar, int Pow){
        Modele=Mod;
        Marque=Mar;
        PuissanceCV=Pow;
        Proprietaire=null ;
    }
    
    @Override
    public String toString() {
        return "une " + Modele +" de "+Marque +" de "+ PuissanceCV +" cheveaux";
    }
}