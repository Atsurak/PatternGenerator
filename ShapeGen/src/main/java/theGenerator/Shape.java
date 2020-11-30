
package theGenerator;

import java.awt.*;

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
