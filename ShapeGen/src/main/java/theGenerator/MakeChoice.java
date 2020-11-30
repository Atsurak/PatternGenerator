/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGenerator;
import java.awt.*; 
import java.util.*;
/**
 *
 * @author HARSH MEENA
 */
public class MakeChoice {
    public int shapeCh, patternCh, col;
    public Color color;
    Scanner sc = new Scanner(System.in);
    
    public void makeChoice(){
        shapeCh = sc.nextInt();
        patternCh = sc.nextInt();
        col = sc.nextInt();
        switch(col){
            case 1: color = Color.RED; break;
            case 2: color = Color.GREEN; break;
            case 3: color = Color.BLUE; break;
            default: color = Color.BLACK;
        }
    }
}
