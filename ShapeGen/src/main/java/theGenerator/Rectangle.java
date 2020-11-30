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
public class Rectangle extends Shape{
    public int length, breadth;
    
    public Rectangle(int length, int breadth, Color color, boolean fill, int shapeID, double rotation){
        super(color, fill, shapeID, rotation);
        this.length=length;
        this.breadth=breadth;
    }
}
