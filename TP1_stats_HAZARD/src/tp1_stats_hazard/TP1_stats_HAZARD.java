package tp1_stats_hazard;

import java.util.Random;
import java.util.Scanner;

/**
 * tp1_manipnombresint_hazard Familiarisation avec la syntaxe Java, de manipuler
 * les opérations de base : affectation, boucles, manipulation de tableaux,
 * subtilités de java 22/10/2025 Romain Hazard
 */
public class TP1_stats_HAZARD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int TabEntier[];
        int m = 0;
        TabEntier = new int[6];
            System.out.println("Choisir un nombre superieur a 0");
            m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = generateurAleat.nextInt(6);
            TabEntier[n] += 1;
        }
        for (int j = 0; j < 6; j++) {
            double pourcentage = (TabEntier[j] * 100.0) / m;
            System.out.println(TabEntier[j]+" Le pourcentage est de "+pourcentage);
        }
    }

}
