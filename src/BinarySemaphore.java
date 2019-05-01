public class BinarySemaphore extends Semaphore {

    public BinarySemaphore(){
        super();
    }

    public BinarySemaphore(int initial){
       if (initial > 0){
           this.value = 1;
       }
    }




    @Override
    public synchronized void V(){
        if (this.value == 0){
            this.value++;
        }

        notify();
    }



}

