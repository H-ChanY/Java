import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Move extends JFrame{
    private JLabel la = new JLabel("Hello");
    public Move(){
        setTitle("F1: green, %: yellow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        c.setLayout(null);
        la.setSize(100,20);
        la.setLocation(50,50);
        c.add(la);
        setSize(250,250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    } 
    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode()==KeyEvent.VK_UP){
                la.setLocation(la.getX(),la.getY()-10);
            }
            else if(e.getKeyCode()==KeyEvent.VK_DOWN){
                la.setLocation(la.getX(),la.getY()+10);
            }
            else if(e.getKeyCode()==KeyEvent.VK_LEFT){
                la.setLocation(la.getX()-10,la.getY());
            }
            else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                la.setLocation(la.getX()+10,la.getY());
            }
            System.out.println("("+la.getX()+", "+la.getY()+")");
        }
    }
    public static void main(String[] args){
        new Move();
    }
}
