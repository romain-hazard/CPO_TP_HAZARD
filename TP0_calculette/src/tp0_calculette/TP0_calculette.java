/* tp0_calculette
Présentation de NetBeans, et mise en place d’un environnement
20/10/2025 Romain Hazard
 */
package tp0_calculette;

import java.util.Scanner;

public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        int operateur = 0;
        Scanner sc = new Scanner(System.in);

        while (operateur < 1 || operateur > 5) {
            System.out.println("Entrer l'operateur :");
            operateur = sc.nextInt();
        }

        float operande1;
        float operande2;
        float result = 0;

        System.out.println("Entrer l'operande1 :");
        operande1 = sc.nextFloat();
        System.out.println("Entrer l'operande2 :");
        operande2 = sc.nextFloat();
        if (operateur == 1) {
            result = operande1 + operande2;
        } else if (operateur == 2) {
            result = operande1 - operande2;
        } else if (operateur == 3) {
            result = operande1 * operande2;
        } else if (operateur == 4 && operande2 == 0) {
            System.out.println("On ne peut pas diviser par 0");
         } else if (operateur == 4){
            result = operande1 / operande2;
        }else if (operateur == 5) {
            result = operande1 % operande2;
        }
        System.out.print("Le résultat est : " + result);
    }
}
