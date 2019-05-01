public class Main {


    public static void main(String[] args) throws InterruptedException{

        long startTime = System.currentTimeMillis();
        //run for 3 seconds
        long endTime = startTime + 1000;



            BinarySemaphore printF = new BinarySemaphore(0);
            BinarySemaphore printG = new BinarySemaphore(1);
            Semaphore trackH = new Semaphore();


            Thread tF = new FThread(printF, printG, trackH);
            Thread tG = new GThread(printF, printG);
            Thread tH = new HThread(trackH);

            tF.start();
            tG.start();
            tH.start();


        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        if (System.currentTimeMillis() > endTime){
            System.exit(0);
        }
    }
}
