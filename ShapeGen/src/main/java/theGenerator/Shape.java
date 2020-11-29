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
public class Shape {
    public String color;
    public boolean fill;
    public int shapeID;
    public double rotation;
    
    public Shape(String color, boolean fill, int shapeID, double rotation){
        this.color = color;
        this.fill = fill;
        this.shapeID = shapeID;
        this.rotation = rotation;
    }
}
