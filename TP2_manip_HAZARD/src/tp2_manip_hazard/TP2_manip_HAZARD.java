/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_hazard;

/**
 * 03/11/2025 Romain Hazard TP2_Bieres familiarisation avec les notions de
 * classes et objets : création de premières classes, instanciation des classes
 * (création d’objet), manipulation des attributs et des méthodes … et
 * traduction progressive d’un diagramme UML en diagramme de classe, et code
 * java..
 */
public class TP2_manip_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        assiette2=assiette1;
        assiette1=assiette3;
        
        System.out.println("nb de calories de Assiette 1 : "+ assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "+ assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+ assiette3.nbCalories);
        
        Moussaka [] references =new Moussaka[10];
        
        for(int i=0; i<10; i++){
            references[i]=new Moussaka(400+10*i);
            System.out.println("nb de calories de Assiette Moussaka num " + i +" est "+references[i].nbCalories);
        }

    }

}
