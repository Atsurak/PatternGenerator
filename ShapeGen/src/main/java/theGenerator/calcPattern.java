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
public class calcPattern {
    private double ourCircRad;
    private int ourSqSide, ourSqP;
    
    public calcPattern(int dim){
        this.ourCircRad=(double)dim;
        this.ourSqSide=dim;
    }
    
    public void calcCoordsCirc(Shape s[],int noShapes){
        double n = (double)noShapes;
        double x = 0, y = 0;
        for (double i = 0.0; i<n; i++){
            x=((ourCircRad*Math.cos(2*Math.PI*(i/n))));
            y=((ourCircRad*Math.sin(2*Math.PI*(i/n)))); 
            s[(int)i].x=(int)x;
            s[(int)i].y=(int)y;
            System.out.println(i+" " +x+" "+y);
        }
    }
    
    public void calcCoordsSq(Shape s[], int noShapes){
        ourSqP = ourSqSide*4;
        s[0].x=(int)(0-(ourSqSide/2));
        s[0].y=(int)(ourSqSide/2);
        System.out.println(0+" " +s[0].x+" "+s[0].y);
        int x = s[0].x, y = s[0].y;
        int sign[] = {1,0};
        int check = ourSqSide/2;
        int gap = (int)(ourSqP/noShapes);
        for (int i = 1; i<noShapes; i++){
            x=x+(sign[0]*gap);
            y=y+(sign[1]*gap);
            if(x>check){
                sign[0]=0;
                sign[1]=-1;
                y = (check)-(x-(check));
                x=check;
            }
            if(x<(0-check)){
                sign[0]=0;
                sign[1]=1;
                y = y+(0-check-x);
                x = 0-check;
            }
            if(y>check){
                sign[0]=1;
                sign[1]=0;
                x = (check)-(y-(check));
                y = check;
            }
            if(y<(0-check)){
                sign[0]=-1;
                sign[1]=0;
                x = check-(0-y-check);
                y = 0-check;
            }
            s[i].x=x;
            s[i].y=y;
            System.out.println(i+" " +x+" "+y);
        }
    }
}
