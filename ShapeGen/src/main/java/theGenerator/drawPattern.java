/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theGenerator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  
/**
 *
 * @author HARSH MEENA
 */
public class drawPattern extends Canvas implements ActionListener{
    
    public Shape s[];
    public int patternCh, shapeCh, noShapes;
    Color color;
    
    public void actionPerformed(ActionEvent event){
    }   
    
    public drawPattern(int patternCh, int shapeCh, int noShapes, int color, int dimx, int dimy){
        this.patternCh=patternCh;
        this.shapeCh=shapeCh;
        switch(color){
            case 0: this.color=Color.RED;break;
            case 1: this.color=Color.BLUE;break;
            case 2: this.color=Color.GREEN;break;
            case 3: this.color=Color.BLACK;break;
            case 4: this.color=Color.ORANGE;break;
        }
        this.noShapes=noShapes;
        switch(shapeCh){
            case 0: s=new Ellipse[noShapes];
                for(int i = 0; i<noShapes; i++){
                    s[i]=new Ellipse(0,0,dimx,dimy,this.color,i,0.0);
                }
                break;
            case 1: s=new Rectangle[noShapes];
                for(int i = 0; i<noShapes; i++){
                    s[i]=new Rectangle(0,0,dimx,dimy,this.color,i,0.0);
                }
                break;
            case 2: s=new RoundRect[noShapes];
                for(int i = 0; i<noShapes; i++){
                    s[i]=new RoundRect(0,0,dimx,dimy,25,this.color,i,0.0);
                }
                break;
        }
    }
    
    @Override
    public void paint(Graphics g) {
        g.translate(400, 400);
        setBackground(Color.WHITE);
        s[0].paint(g);
    }
    
    public void drawPat(){
        //System.out.println(patternCh+" "+shapeCh+" "+noShapes+ " "+color);
        JFrame f=new JFrame("Border Layout");  
        f.add(this,BorderLayout.CENTER);  
        JButton buttonL = new JButton("<--");
        JButton buttonR = new JButton("-->");
        buttonL.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                s[0].rotation-=5.0;
                System.out.println(s[0].rotation);
                repaint();
            }
        });
        buttonR.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                s[0].rotation+=5.0;
                System.out.println(s[0].rotation);
                repaint();
            }
        });
        JPanel rotator = new JPanel ();
        rotator.add(buttonL);
        rotator.add(buttonR);
        f.add(rotator,BorderLayout.SOUTH);
        f.setSize(800,800);
        f.setVisible(true);
    }
}
