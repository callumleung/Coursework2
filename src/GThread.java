import java.util.Random;

public class GThread extends Thread{

    private BinarySemaphore printF;
    private BinarySemaphore printG;

    GThread(BinarySemaphore printF, BinarySemaphore printG) {
        this.printF = printF;
        this.printG = printG;
    }

    public void run(){
        Random rand = new Random();


            while (true){

                //wait until F has been printed
                try {
                    sleep(rand.nextInt(100));
                    printF.P();
                } catch (InterruptedException e){

                }
                //print G
                System.out.println("G");

                //signal F
                printG.V();
            }


        }
}
