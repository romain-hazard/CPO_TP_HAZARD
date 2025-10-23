/* tp0_helloWorld
Présentation de NetBeans, et mise en place d’un environnement
20/10/2025 Romain Hazard
*/
package tp0_helloworld;

import java.util.Scanner;

public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Bonjour");
       System.out.println("Au revoir");
       String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();     
    }
    
}
