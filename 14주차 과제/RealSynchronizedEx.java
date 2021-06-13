public class RealSynchronizedEx {
    public static void main(String[] args){
        SharedBoard2 board = new SharedBoard2();
        Thread th1= new StudentThread2("Bezos",board);
        Thread th2= new StudentThread2("Musk",board);
        th1.start();
        th2.start();
    }
}
class SharedBoard2{
    private int sum=0;
    synchronized public void add(){
        int n= sum;
        n+=10;
        sum=n;
        System.out.println(Thread.currentThread().getName()+" : "+ sum);
    }
    public int getSum(){return sum;}
}

class StudentThread2 extends Thread{
    private SharedBoard2 board;
    public StudentThread2(String name, SharedBoard2 board){
        super(name);
        this.board=board;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            board.add();
            try{
                sleep(100);
            }
            catch(InterruptedException e){
                return;
            }
        }
    }
}