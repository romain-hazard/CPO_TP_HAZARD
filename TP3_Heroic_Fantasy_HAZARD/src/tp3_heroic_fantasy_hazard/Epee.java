/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_hazard;

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
    
}
