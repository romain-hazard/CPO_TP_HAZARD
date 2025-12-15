/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
import java.util.Random;

public class Jeu {

    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    private int[][] grid = new int[4][4];
    private Random rand = new Random();

    
    public int[][] getGrid() {
        return grid;
    }
 
      
}
