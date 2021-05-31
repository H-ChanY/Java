import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTestEx2 extends JFrame{
    public KeyEventTestEx2(){
        setTitle("Key event listener 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener2());
        setSize(250,250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    
    class MyKeyListener2 extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            int code = e.getKeyCode();
            char ch = e.getKeyChar();
            System.out.println("Key pressed "+ch+", "+code+", "+e.getKeyText(code));
        }
        public void keyReleased(KeyEvent e){
            System.out.println("Key released");
        }
        public void keyTyped(KeyEvent e){
            System.out.println("Key typed");
        }
    }
    public static void main(String[] args){
        new KeyEventTestEx2();
    }
}
