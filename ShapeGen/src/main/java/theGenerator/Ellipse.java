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
public class Ellipse extends Shape{
    public int radius1, radius2;
    
    public Ellipse(int x, int y, int radius1, int radius2, Color color, int shapeID, double rotation){
        super(x,y,color, shapeID, rotation);
        this.radius1=radius1;
        this.radius2=radius2;
    }
    
    @Override
    public void paint(Graphics g){
        int dx, dy;
        Graphics2D g2 = (Graphics2D)g; 
        g2.setColor(color);
        dx = x-(radius1/2);
        dy = y-(radius2/2);
        g2.rotate(Math.toRadians(rotation));
        g2.fillOval(dx,dy,radius1,radius2);
    }
}
