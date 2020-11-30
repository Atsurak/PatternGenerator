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
public class shapeMenu {
    public String shapes[] = {"Rectangle","Ellipse","Triangle"};
    public String patterns[] = {"Rectangle","Ellipse","Triangle"};
    
    public void Display(){
        System.out.println("1- "+shapes[0]+" "+"2- "+shapes[1]+" "+"3- "+shapes[2]);
        System.out.println("1- "+patterns[0]+" "+"2- "+patterns[1]+" "+"3- "+patterns[2]);
    }
}
