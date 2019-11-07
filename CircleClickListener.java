/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker;

import java.awt.*;  
import java.awt.event.*;  
public class CircleClickListener extends Frame implements MouseListener{  
    CircleClickListener(){  
        addMouseListener(this);  
          
        setSize(4000,4000);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e) {  
        Graphics g=getGraphics();  
        g.setColor(Color.BLUE);  
        g.fillOval(e.getX(),e.getY(),30,30);  
    }  
    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {
    if ((e.getX()-20) >= 75 &&e.getX()<=1250 && (e.getY()-20) >= 75 && e.getY() <=1250 ) {
    Graphics g=getGraphics();
    g.setColor (Color.RED);
    g.fillOval(500,500,40,40);
    System.out.println("success");
    //replace numbers with object locations in the array
    //replace the print location with the object location
    }  
    else {
        Graphics g=getGraphics();
        g.setColor(Color.WHITE);
        g.fillOval(500,500,40,40);
        System.out.println("Failure");
    }
    }
      
public static void main(String[] args) {  
    new CircleClickListener();  
}  
}  