/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGenerator;

import java.awt.*;
import javax.swing.*;  
/**
 *
 * @author HARSH MEENA
 */
public class Ellipse extends Shape{
    public int radius1, radius2;
    
    public Ellipse(int radius1, int radius2, Color color, boolean fill, int shapeID, double rotation){
        super(color, fill, shapeID, rotation);
        this.radius1=radius1;
        this.radius2=radius2;
    }
}
