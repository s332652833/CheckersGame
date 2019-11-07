package mousemovement;

import java.awt.*;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseMotionListener;  
public class MouseMovement extends Frame implements MouseMotionListener{  
    Label l;  
    Color c=Color.BLUE;  
    MouseMovement(){  
    l=new Label();  
    l.setBounds(20,40,100,20);  
    add(l);  
      
    addMouseMotionListener(this);  
      
    setSize(4000,4000);  
    setLayout(null);  
    setVisible(true);  
}  

public void mouseClicked (MouseEvent e){
    Graphics g=getGraphics();
    g.setColor(Color.RED);
    g.fillOval(e.getX(),e.getY(),20,20);
}
public void mouseMoved(MouseEvent e) {  
    l.setText("X="+e.getX()+", Y="+e.getY());

}  

public void mouseDragged(MouseEvent e) {  
    l.setText("X="+e.getX()+", Y="+e.getY());  
    Graphics g=getGraphics();  
    g.setColor(Color.WHITE); // Instead of making it white reset the board
    g.fillRect(0,0,4000,4000);
            
    g.setColor(Color.RED);  
    g.fillOval(e.getX(),e.getY(),40,40); 
}  

public static void main(String[] args) {  
    new MouseMovement();  
}  
}  