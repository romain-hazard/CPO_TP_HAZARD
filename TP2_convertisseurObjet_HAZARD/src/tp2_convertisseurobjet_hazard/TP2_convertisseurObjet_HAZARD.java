/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_hazard;

/**
 03/11/2025 Romain Hazard
 TP2_Bieres
 familiarisation avec les notions de classes et objets : création de premières classes,
instanciation des classes (création d’objet), manipulation des attributs et des méthodes … et traduction
progressive d’un diagramme UML en diagramme de classe, et code java..
 */

public class TP2_convertisseurObjet_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur2 conv = new Convertisseur2();
        conv.CelciusVersKelvin(1.0);
        conv.KelvinVersCelcius(56.9);
        conv.FarenheitVersCelcius(48.8);
        conv.CelciusVersFarenheit(204.6);
        conv.KelvinVersFarenheit(5.9);
        conv.FarenheitVersKelvin(36.2);
        
        
    }
    
}
