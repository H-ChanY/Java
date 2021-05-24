import java.awt.*;
import javax.swing.*;

class GridLayoutEx extends JFrame{
    GridLayoutEx(){
        setTitle("GridLayout");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,3));
        Container c= getContentPane();
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));
        c.add(new JButton("10"));
        c.add(new JButton("11"));
        c.add(new JButton("12"));
        setVisible(true);
        
    }
}

public class Q6 {
    public static void main(String[] args){
        new GridLayoutEx();
    }
}
