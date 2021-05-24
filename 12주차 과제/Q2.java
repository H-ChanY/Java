import java.awt.*;
import javax.swing.*;

class PaneEx extends JFrame{
    public PaneEx(){
        setTitle("Three Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane= getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("Ok"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }
}


public class Q2 {
    public static void main(String[] args){
        new PaneEx();
    }   
}
