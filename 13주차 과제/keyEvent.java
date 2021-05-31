import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class keyEvent extends JFrame{
    public keyEvent(){
        setTitle("F1: green, %: yellow");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        setSize(250,250);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            
        if(e.getKeyChar()=='%'){
            Component c = (Component)e.getSource();//입력된 컴포넌트
            c.setBackground(Color.YELLOW);
        }
        else if(e.getKeyCode()==KeyEvent.VK_F1){
            Component c = (Component)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }
        
    }
    public static void main(String[] args){
        new keyEvent();
    }
}
