
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Romain
 */
public class Grille {

    private int[][] grille;
    private Random hasard;

    public Grille() {
        grille = new int[4][4];
        hasard = new Random();
        ajouterNombre();
        ajouterNombre();
    }

    public int[][] getGrille() {
        return grille;
    }

    public void ajouterNombre() {
        
        int ligne, colonne;

        do {
            ligne = hasard.nextInt(4);
            colonne = hasard.nextInt(4);
        } while (grille[ligne][colonne] != 0);

        if (hasard.nextBoolean()) {
            grille[ligne][colonne] = 1;
        } else {
            grille[ligne][colonne] = 2;
        }

    }

    public boolean fusion(int x1, int y1, int x2, int y2) {
    int a = grille[x1][y1];
    int b = grille[x2][y2];

    if (a == 0 || b == 0) return false;

    if ((a == 1 && b == 2) || (a == 2 && b == 1)) {
        grille[x1][y1] = 3;
        grille[x2][y2] = 0;
        return true;
    } else if (a == b && a > 2) {
        grille[x1][y1] = a * 2;
        grille[x2][y2] = 0;
        return true;
    }
    return false;
}


    public void ajouterNombreDansGrille() {
        ajouterNombre();
    }
}
