import java.util.Random;

public class HThread extends Thread{

    private Semaphore HCount;

    public HThread(Semaphore HCount){

        this.HCount = HCount;
    }

    public void run(){
        Double delay = Math.random();
        Random rand = new Random();

      /*  try {
            sleep(delay.longValue());
        } catch (InterruptedException ie){

        }*/

        while(true){
            try {
                sleep(rand.nextInt(100));
            } catch (InterruptedException ie){

            }
            System.out.println("H");
            HCount.V();
        }

    }
}
