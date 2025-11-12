/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_hazard;

import java.util.Random;
import java.util.Scanner;

/**
 * tp1_manipnombresint_hazard Familiarisation avec la syntaxe Java, de manipuler
 * les opérations de base : affectation, boucles, manipulation de tableaux,
 * subtilités de java 22/10/2025 Romain Hazard
 */
public class TP1_guessMyNumber_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100)+1;
        int Nb = -1;
        int Cpt = 0;
        int Dif = 0;
        while (1 > Dif || Dif > 3) {
            System.out.println("Choisir une difficulté");
            System.out.println("1) Facile");
            System.out.println("2) Normal");
            System.out.println("3) Difficile");
            Dif = sc.nextInt();
            if (1 > Dif || Dif > 3) {
                System.out.println("Veuillez choisir une valeur entre 1 et 3");
            }
        }

        if (Dif == 3) {
            while (Nb != n && Cpt < 3) {
                System.out.println("Saisissez un nombre entre 1 et 100");
                Nb = sc.nextInt();
                Cpt ++;
                
                if (Nb == n) {
                    System.out.println("Gagné");
                } else if (Nb < n) {
                    System.out.println("Trop petit");
                } else {
                    System.out.println("Trop grand");
                }

            }
            if (Nb != n) {
                System.out.println("Perdu ! Le nombre était : " + n);
            }
            System.out.println("Vous avez fait " + Cpt + " tentatives");

        }
    }
}
