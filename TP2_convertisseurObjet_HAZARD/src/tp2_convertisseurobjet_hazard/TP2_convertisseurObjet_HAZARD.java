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
        Convertisseur2 conv1 = new Convertisseur2();
        Convertisseur2 conv = new Convertisseur2();
        System.out.println( "7.1 degre Celcius donne " + conv1.CelciusVersKelvin(1.0) + " K" ) ;
        System.out.println( "34.0 degre Farenheit donne " + conv1.FarenheitVersCelcius(48.8) + " degre Celcius" );
        System.out.println( " 265.0 K donne " + conv1.KelvinVersFarenheit(5.9) + " degre Farenheit" ) ;
        
        System.out.println( "6.8 degre Celcius donne " + conv.CelciusVersFarenheit(204.6) + " degre Farenheit" ) ;
        System.out.println( "71.5 degre Farenheit donne " + conv.FarenheitVersKelvin(5.9) + " K" ) ;
        System.out.println( " 294.3 K donne " + conv.KelvinVersCelcius(59.9) + " degre Celcius" ) ;
       
        System.out.println(conv1);
        System.out.println(conv) ;      
    }
    
}
