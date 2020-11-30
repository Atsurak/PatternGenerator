package theGenerator;

import java.awt.*;  

public class Ellipse extends Shape{
    public int length, breadth;
    
    public Ellipse(int x, int y, int length, int breadth, Color color, int shapeID, double rotation){
        super(x,y,color, shapeID, rotation);
        this.length=length;
        this.breadth=breadth;
    }
    
    @Override
    public void paint(Graphics g){
        int dx, dy;
        Graphics2D g2 = (Graphics2D)g; 
        g2.setColor(color);
        dx = x-(length/2);
        dy = y-(breadth/2);
        g2.rotate(Math.toRadians(rotation));
        g2.fillOval(dx,dy,length,breadth);
    }
}
