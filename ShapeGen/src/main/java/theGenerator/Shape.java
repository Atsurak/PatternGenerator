/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGenerator;

import java.awt.*;
/**
 *
 * @author HARSH MEENA
 */
public class Shape extends Canvas{
    public Color color;
    public int shapeID, x, y;
    public double rotation;
    
    public Shape(int x, int y, Color color, int shapeID, double rotation){
        this.x=x;
        this.y=y;
        this.color = color;
        this.shapeID = shapeID;
        this.rotation = rotation;
    }
}
