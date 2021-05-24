import java.awt.*;
import javax.swing.*;
class GridLayoutEx2 extends JFrame {
    public GridLayoutEx2() {
        setTitle("GridLayout2");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        Container c = getContentPane();
        c.add(new JLabel("Name"));
        c.add(new JTextField(""));
        c.add(new JLabel("Student ID"));
        c.add(new JTextField(""));
        c.add(new JLabel("Major"));
        c.add(new JTextField(""));
        c.add(new JLabel("Subject"));
        c.add(new JTextField(""));
        setVisible(true);
}
}

public class Q7 {
    public static void main(String[] args){
        new GridLayoutEx2();
    }
}
