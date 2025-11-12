/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_hazard;

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
    
}
