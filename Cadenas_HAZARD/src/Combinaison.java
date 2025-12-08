
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author romai
 */
public class Combinaison {
    
    
    private int[] combinaisonSecrete;
    
    
    public void genererCombinaison(){
        combinaisonSecrete=new int[4];
        Random r= new Random();
        for (int i=0; i<4;i++){
            r.nextInt(10);}
    } 
    
    
      public int[] getCombinaisonSecrete() {
        return combinaisonSecrete;
    }

    public int compterChiffresExacts(int[] prop) {
        int exacts = 0;
        for (int i = 0; i < 4; i++) {
            if (prop[i] == combinaisonSecrete[i]) exacts++;
        }
        return exacts;
    }
    
    
        
        }

    
    
   

    
  

    
    
    
