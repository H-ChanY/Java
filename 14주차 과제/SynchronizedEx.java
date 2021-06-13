class SharedBoard{
    private int sum=0;
    public void add(){
        int n= sum;
        n+=10;
        sum=n;
        System.out.println(Thread.currentThread().getName()+" : "+ sum);
    }
    public int getSum(){return sum;}
}

class StudentThread extends Thread{
    private SharedBoard board;
    public StudentThread(String name, SharedBoard board){
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


public class SynchronizedEx {
    public static void main(String[] args){
        SharedBoard board = new SharedBoard();
        Thread th1= new StudentThread("Bezos",board);
        Thread th2= new StudentThread("Musk",board);
        th1.start();
        th2.start();
    }
}
