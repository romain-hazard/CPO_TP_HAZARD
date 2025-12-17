/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Romain
 */
public class Jeu {

    private Grille grille;
    private int coups;

    public Jeu() { 
        grille = new Grille();  
        coups = 0;
    }

    public int[][] getGrille() {
        return grille.getGrille();
    }

    public int getCoups() {
        return coups;
    }

    public void jouer(String direction) {

        
        if (direction.equals("gauche")) {
            deplacerGauche();
        }
        if (direction.equals("droite")) {
            deplacerDroite();
        }
        if (direction.equals("haut")) {
            deplacerHaut();
        }
        if (direction.equals("bas")) {
            deplacerBas();
        }

        coups++;
        grille.ajouterNombre();
        
    }

    private void deplacerGauche() {
        int[][] g = grille.getGrille();

        for (int i = 0; i < 4; i++) {

            for (int k = 0; k < 3; k++) {
                for (int j = 1; j < 4; j++) {
                    if (g[i][j] != 0 && g[i][j - 1] == 0) {
                        g[i][j - 1] = g[i][j];
                        g[i][j] = 0;
                    }
                }
            }

            for (int j = 0; j < 3; j++) {
                grille.fusion(i, j, i, j + 1);
            }
        }
    }

    private void deplacerDroite() {
        int[][] g = grille.getGrille();

        for (int i = 0; i < 4; i++) {

            for (int k = 0; k < 3; k++) {
                for (int j = 2; j >= 0; j--) {
                    if (g[i][j] != 0 && g[i][j + 1] == 0) {
                        g[i][j + 1] = g[i][j];
                        g[i][j] = 0;
                    }
                }
            }

            for (int j = 3; j > 0; j--) {
                grille.fusion(i, j, i, j - 1);
            }
        }
    }

    private void deplacerHaut() {
        int[][] g = grille.getGrille();

        for (int j = 0; j < 4; j++) {

            for (int k = 0; k < 3; k++) {
                for (int i = 1; i < 4; i++) {
                    if (g[i][j] != 0 && g[i - 1][j] == 0) {
                        g[i - 1][j] = g[i][j];
                        g[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < 3; i++) {
                grille.fusion(i, j, i + 1, j);
            }
        }
    }

    private void deplacerBas() {
        int[][] g = grille.getGrille();

        for (int j = 0; j < 4; j++) {

            for (int k = 0; k < 3; k++) {
                for (int i = 2; i >= 0; i--) {
                    if (g[i][j] != 0 && g[i + 1][j] == 0) {
                        g[i + 1][j] = g[i][j];
                        g[i][j] = 0;
                    }
                }
            }

            for (int i = 3; i > 0; i--) {
                grille.fusion(i, j, i - 1, j);
            }
        }
    }

}
