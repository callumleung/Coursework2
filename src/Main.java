public class Main {


    public static void main(String[] args) throws InterruptedException{

            //create the binary and regular semaphore
            BinarySemaphore printF = new BinarySemaphore(0);
            BinarySemaphore printG = new BinarySemaphore(1);
            Semaphore trackH = new Semaphore();


            //create threads and start them
            Thread tF = new FThread(printF, printG, trackH);
            Thread tG = new GThread(printF, printG);
            Thread tH = new HThread(trackH);

            tF.start();
            tG.start();
            tH.start();


        //ends the programme after 1 second
        Thread.sleep(1000);{
            System.exit(0);
        }
    }
}
