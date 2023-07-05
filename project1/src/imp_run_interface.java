class Demo implements Runnable{
    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getId());
    }
}

public class imp_run_interface {
    public static void main(String[] args) {
        int threadNo= 5;
        for(int i= 0; i<threadNo; i++){
            Thread t= new Thread(new Demo());
            t.start();
        }
    }

}
