import java.awt.*;
import javax.swing.*;

class FlowLayoutEx extends JFrame{
    FlowLayoutEx(){
        setTitle("FlowLayout");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container c = getContentPane();
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mult"));
        c.add(new JButton("div"));
        c.add(new JButton("calculate"));
        setVisible(true);

    }
}

public class Q3 {
    public static void main(String[] args){
        new FlowLayoutEx();
    }
}
