import java.util.Random;

public class FThread extends Thread {

    private BinarySemaphore printF;
    private BinarySemaphore printG;
    private Semaphore trackH;

    FThread(BinarySemaphore printF, BinarySemaphore printG, Semaphore trackH) {
        this.printF = printF;
        this.printG = printG;
        this.trackH = trackH;
    }

    public void run() {

        Random rand = new Random();

        while (true){
            //wait until G has been printed
            try {
                sleep(rand.nextInt(100));
                trackH.P();
                printG.P();
            } catch (InterruptedException e){

            }
            //print F
            System.out.println("F");

            //signal G
            printF.V();
        }


    }
}
