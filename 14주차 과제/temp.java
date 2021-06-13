public import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyLabel extends JLabel{
    int curVal=0;
    int maxVal=100;
        public MyLabel(){
            setText(Integer.toString(curVal));
        }
    
    synchronized void fill(){
        if(curVal== maxVal){
            try{
                wait();
            }catch(InterruptedException e){
                return;
            }
            
        }
        curVal++;
        setText(Integer.toString(curVal));
        notify();
        
    }
    synchronized void consume(){
        if(curVal==0){
            try{
                wait();
            }
            catch(InterruptedException e){
                return;
            }
            
        }
        curVal--;
        setText(Integer.toString(curVal));
        notify();
    }
}

class ConsumerThread extends Thread{
    MyLabel bar;
    ConsumerThread(MyLabel bar){
        this.bar=bar;
    }
    public void run(){
        while(true){
            try{
                sleep(200);
                bar.consume();
            }catch(InterruptedException e){
                return;
            }
        }
    }
}

public class TabAndThreadEx extends JFrame{
    TabAndThreadEx(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        MyLabel bar =new MyLabel();
        bar.setFont(new Font("Gothic",Font.ITALIC,80));
        bar.setSize(300,200);
        c.add(bar);

        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                bar.fill();
            }
        });
        setSize(350,200);
        setVisible(true);
        c.requestFocus();

        ConsumerThread th = new ConsumerThread(bar);
        th.start();
    }
    public static void main(String[] args){
        new TabAndThreadEx("Fill number");
    }
    
}
class temp {
    
}
