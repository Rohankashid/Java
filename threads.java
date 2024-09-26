class A extends Thread{
    public void run(){ //run method is to run the thread
        for (int i = 0; i < 100; i++) {
            
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } //this method will ask the thread to sleep for 10 miliseconds
        }
    }
}


class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } //

        }
    }
}

public class threads {
    public static void main(String[] args) {

        A a=new A(); //thread1
        B b=new B(); //thread2

        System.out.println(a.getPriority()); //will give of the priority of the thread
        b.setPriority(Thread.MAX_PRIORITY); //suggest the schedular fo rthe priority

        a.start(); //start is in built method to create the thread
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } //
        b.start();
        
    }
}
