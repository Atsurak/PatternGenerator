/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGenerator;

/**
 *
 * @author HARSH MEENA
 */
public class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    public Rectangle(double length, double breadth, String color, boolean fill, int shapeID, double rotation){
        super(color, fill, shapeID, rotation);
        this.length=length;
        this.breadth=breadth;
    }
}
