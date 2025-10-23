/* tp0_addition
Présentation de NetBeans, et mise en place d’un environnement
20/10/2025 Romain Hazard
*/
package tp0_addition;

import java.util.Scanner;

public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
        int result; // resultat
        int ind; //indice
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb=sc.nextInt();
        result=0;
        ind=1;
        while (ind< nb) {
        result=result+ind;
        ind++;
        }
        System.out.println("la somme des "+ nb + " entiers est:"+result); }
    
}
