/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_hazard;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author romai
 */
public class TP3_Heroic_Fantasy_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibure=new Epee("Excalibure",7,5);
        Epee Durandal=new Epee("Duarandale",4,7);
        Baton Chene=new Baton("Chene",4,5);
        Baton Charme=new Baton("Charme",5,6);
     
        
        
        ArrayList<Arme>armes =new ArrayList<>();
        armes.add(Excalibure);
        armes.add(Durandal);
        armes.add(Chene);
        armes.add(Charme);
        
        
        for (int i=0; i<armes.size(); i++){
            System.out.println(armes.get(i));
        }
        
        Magicien Gandalf=new Magicien("Gandalf", 65, true);
        Magicien Garcimore=new Magicien("Garcimore", 44, false);
        Guerrier Conan=new Guerrier("Conan", 78, false);
        Guerrier Lannister=new Guerrier("Lannister", 45, true);
        
        
        ArrayList<Personnage>personnages =new ArrayList<>();
        personnages.add(Gandalf);
        personnages.add(Garcimore);
        personnages.add(Conan);
        personnages.add(Lannister);
        
        
        for (int i=0; i<armes.size(); i++){
            System.out.println(armes.get(i));
        }
        
    }
    
}
