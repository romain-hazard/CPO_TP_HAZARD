/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author romai
 */
public class Baton extends Arme {
    int Age;
    
    public Baton(String nom, int niv, int age) {
        super(nom, niv);
        
        if(Age>100){
            age=100;
        }else if(Age<0){
            age=0;
        }else {
            Age=age;
        }
    }

    public int getAge() {
        return Age;
    }

    public String getNom() {
        return Nom;
    }

    public int getNiveau() {
        return Niveau;
    }
    
    
    
}
