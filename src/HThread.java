import java.util.Random;

public class HThread extends Thread{

    private Semaphore HCount;

    public HThread(Semaphore HCount){

        this.HCount = HCount;
    }

    public void run(){
        Random rand = new Random();

        //wait a random amount of time
        while(true){
            try {
                sleep(rand.nextInt(100));
            } catch (InterruptedException ie){

            }
            //print H and increase the semaphore
            System.out.println("H");
            HCount.V();
        }

    }
}
