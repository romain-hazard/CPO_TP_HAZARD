
package tp1_manipnombresint_hazard;

/* tp1_manipnombresint_hazard
Familiarisation avec la syntaxe Java, de manipuler les opérations de base :
affectation, boucles, manipulation de tableaux, subtilités de java
22/10/2025 Romain Hazard
*/

import java.util.Scanner;

public class TP1_manipNombresInt_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Saisir deux entiers");
        Scanner sc = new Scanner(System.in);
        int entier1 = sc.nextInt();
        int entier2 = sc.nextInt();
        
        System.out.println("Les entiers sont "+entier1+" et "+entier2);
        System.out.println("La somme est "+(entier1+entier2));
        System.out.println("La difference est "+(entier1-entier2));
        System.out.println("Le produit est "+(entier1*entier2));
        System.out.println("Le quotient entier est "+(entier1/entier2)+" et le reste "+(entier1%entier2));
        
    }
    
}
