import java.awt.*;
import javax.swing.*;

class BorderLayoutEx extends JFrame{
    public BorderLayoutEx(){
        setTitle("BorderLayout");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new BorderLayout(30,20));
        c.add(new JButton("north"),BorderLayout.NORTH);
        c.add(new JButton("center"),BorderLayout.CENTER);
        c.add(new JButton("west"),BorderLayout.WEST);
        c.add(new JButton("east"),BorderLayout.EAST);
        c.add(new JButton("south"),BorderLayout.SOUTH);
        setVisible(true);
    }
}

public class Q5 {
    public static void main(String[] args){
        new BorderLayoutEx();
    }    
}
