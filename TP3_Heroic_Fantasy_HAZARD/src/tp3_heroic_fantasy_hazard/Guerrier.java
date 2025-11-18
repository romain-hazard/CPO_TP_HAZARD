/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_hazard;

/**
 *
 * @author romai
 */
public class Guerrier extends Personnage{
    
    boolean cheval;
    
    public Guerrier(int nom, int niveau_vie, boolean cheval) {
        super(nom, niveau_vie);
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
}
