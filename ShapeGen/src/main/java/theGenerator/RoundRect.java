package theGenerator;

import java.awt.*;  

public class RoundRect extends Shape{
    private int length, breadth, arc;
    public RoundRect(int x, int y, int length, int breadth, int arc, Color color, int shapeID, double rotation){
        super(x,y,color, shapeID, rotation);
        this.length=length;
        this.breadth=breadth;
        this.arc=arc;
    }
    
    public void paint(Graphics g){
        int dx, dy;
        Graphics2D g2 = (Graphics2D)g; 
        g2.setColor(color);
        dx = x-(length/2);
        dy = y-(breadth/2);
        g2.rotate(Math.toRadians(rotation));
        g2.fillRoundRect(dx,dy,length,breadth,arc,arc);
    }
}
