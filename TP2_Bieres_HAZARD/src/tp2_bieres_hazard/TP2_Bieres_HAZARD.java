/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_hazard;

/**
 03/11/2025 Romain Hazard
 TP2_Bieres
 familiarisation avec les notions de classes et objets : création de premières classes,
instanciation des classes (création d’objet), manipulation des attributs et des méthodes … et traduction
progressive d’un diagramme UML en diagramme de classe, et code java..
 */
public class TP2_Bieres_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
 
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe");
        autreBiere.lireEtiquette();
        
        System.out.println(uneBiere) ;
    }
    
}
