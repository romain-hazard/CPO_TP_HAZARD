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
        boolean aBouge = false;

        switch (direction) {
            case "gauche" ->
                aBouge = deplacerGauche();
            case "droite" ->
                aBouge = deplacerDroite();
            case "haut" ->
                aBouge = deplacerHaut();
            case "bas" ->
                aBouge = deplacerBas();
        }

        if (aBouge) {
            grille.ajouterNombre();
            coups++;
        }

        if (estPerdu()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Vous avez perdu !");
        }

        coups++;
        grille.ajouterNombre();

    }

    private boolean deplacerGauche() {
        int[][] g = grille.getGrille();
        boolean aBouge = false;

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 1; j < 4; j++) {
                    if (g[i][j] != 0 && g[i][j - 1] == 0) {
                        g[i][j - 1] = g[i][j];
                        g[i][j] = 0;
                        aBouge = true;
                    }
                }
            }
            for (int j = 0; j < 3; j++) {
                if (grille.fusion(i, j, i, j + 1)) {
                    aBouge = true;
                }
            }
        }
        return aBouge;
    }

    private boolean deplacerDroite() {
        int[][] g = grille.getGrille();
        boolean aBouge = false;

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 2; j >= 0; j--) {
                    if (g[i][j] != 0 && g[i][j + 1] == 0) {
                        g[i][j + 1] = g[i][j];
                        g[i][j] = 0;
                        aBouge = true;
                    }
                }
            }
            for (int j = 3; j > 0; j--) {
                if (grille.fusion(i, j, i, j - 1)) {
                    aBouge = true;
                }
            }
        }
        return aBouge;
    }

    private boolean deplacerHaut() {
        int[][] g = grille.getGrille();
        boolean aBouge = false;

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 3; k++) {
                for (int i = 1; i < 4; i++) {
                    if (g[i][j] != 0 && g[i - 1][j] == 0) {
                        g[i - 1][j] = g[i][j];
                        g[i][j] = 0;
                        aBouge = true;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (grille.fusion(i, j, i + 1, j)) {
                    aBouge = true;
                }
            }
        }
        return aBouge;
    }

    private boolean deplacerBas() {
        int[][] g = grille.getGrille();
        boolean aBouge = false;

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 3; k++) {
                for (int i = 2; i >= 0; i--) {
                    if (g[i][j] != 0 && g[i + 1][j] == 0) {
                        g[i + 1][j] = g[i][j];
                        g[i][j] = 0;
                        aBouge = true;
                    }
                }
            }
            for (int i = 3; i > 0; i--) {
                if (grille.fusion(i, j, i - 1, j)) {
                    aBouge = true;
                }
            }
        }
        return aBouge;
    }

    public boolean estPerdu() {
        int[][] g = grille.getGrille();

        // Vérifie s'il reste une case vide
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (g[i][j] == 0) {
                    return false;
                }
            }
        }

        // Vérifie s'il y a des fusions possibles
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < 3 && fusionPossible(g[i][j], g[i + 1][j])) {
                    return false;
                }
                if (j < 3 && fusionPossible(g[i][j], g[i][j + 1])) {
                    return false;
                }
            }
        }

        return true; // perdu
    }

    private boolean fusionPossible(int a, int b) {
        return (a == 0 || b == 0 || (a == 1 && b == 2) || (a == 2 && b == 1) || (a == b && a > 2));
    }

}
