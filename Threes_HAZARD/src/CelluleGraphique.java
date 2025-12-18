/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class CelluleGraphique extends JButton {
    private Jeu jeu;
    private int i, j;

    public CelluleGraphique(Jeu jeu, int i, int j) {
        this.jeu = jeu;
        this.i = i;
        this.j = j;
    }
 public void mettreAJour() {
        int valeur = jeu.getGrille()[i][j];

        if (valeur == 0) {
            setText("");
            setBackground(new Color(139, 176, 176));
        } else {
            setText(String.valueOf(valeur));
            
            
             switch (valeur) {
                case 1 -> {
                    setBackground(new Color(107, 205, 253)); 
                    setForeground(new Color(255, 255, 255));
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                case 2 ->{
                    setBackground(new Color(253, 105, 131));
                    setForeground(new Color(255, 255, 255));
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                case 3 ->{
                    setBackground(new Color(255, 255, 255));
                    setForeground(Color.black);
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                case 6 -> {
                    setBackground(new Color(255, 255, 255));
                    setForeground(Color.black);
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                case 12 -> {
                    setBackground(new Color(255, 255, 255));
                    setForeground(new Color(253, 105, 131));
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                case 24 -> {
                    setBackground(new Color(255, 255, 255));
                    setForeground(new Color(253, 105, 131));
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                case 42 -> {
                    setBackground(new Color(255, 255, 255));
                    setForeground(new Color(253, 105, 131));
                    setFont(new Font("Avenir Next Cyr", Font.PLAIN, 12));
                }
                default -> setBackground(Color.RED);
            }
            
        }
    }
}

