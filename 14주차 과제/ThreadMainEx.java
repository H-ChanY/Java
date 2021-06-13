public class ThreadMainEx {
    public static void main(String[] args){
        long id = Thread.currentThread().getId();
        String name= Thread.currentThread().getName();
        int priority =Thread.currentThread().getPriority();
        Thread.State s= Thread.currentThread().getState();
        System.out.println("Thread name= "+name);
        System.out.println("Thread ID = " + id);
        System.out.println("Priority = " + priority);
        System.out.println("State = " + s);

    }
}
