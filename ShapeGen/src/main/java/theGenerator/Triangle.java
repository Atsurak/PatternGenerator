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
public class Triangle extends Shape{
    public double side;
    public Triangle(double side, Color color, boolean fill, int shapeID, double rotation){
        super(color, fill, shapeID, rotation);
        this.side=side;
    }
}
