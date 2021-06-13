import java.awt.*;
import javax.swing.*;

class TimerRunnable2 implements Runnable{
    private JLabel timerLabel;
    public TimerRunnable2(JLabel timerLabel){
        this.timerLabel=timerLabel;
    }
    
    @Override
    public void run(){
        int n=0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){return ;}
        }
    }
}
public class RunnableTimerEx extends JFrame {
    public RunnableTimerEx(){
        setTitle("Timer Thread Ex");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());
        JLabel timerLabel= new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerLabel);
        Thread th= new Thread(new TimerRunnable2(timerLabel));
        setSize(300,170);
        setVisible(true);
        th.start();
    }    
    public static void main(String[] args){
        new RunnableTimerEx();
    }
}
