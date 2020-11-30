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
public class drawPattern extends Canvas{
    
    public Ellipse e[] = new Ellipse[1000];
    public Rectangle r[] = new Rectangle[1000];
    public Triangle t[] = new Triangle[1000];
    public int patternCh, shapeCh;
    public Color color;
    
    public drawPattern(int patternCh, int shapeCh, Color color){
        this.patternCh=patternCh;
        this.shapeCh=shapeCh;
        this.color=color;
    }
    
    @Override
    public void paint(Graphics g) {
        setBackground(Color.WHITE);  
    }
    
    public static void main(String args[]){
        MakeChoice ch = new MakeChoice();
        shapeMenu sm = new shapeMenu();
        sm.Display();
        ch.makeChoice();
        drawPattern m=new drawPattern(ch.patternCh, ch.shapeCh, ch.color);
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(800,800);
        f.setVisible(true);
    }
}
