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
public class Ellipse extends Shape{
    public double radius1;
    public double radius2;
    
    public Ellipse(double radius1, double radius2, String color, boolean fill, int shapeID, double rotation){
        super(color, fill, shapeID, rotation);
        this.radius1=radius1;
        this.radius2=radius2;
    }
}
