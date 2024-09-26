class Z {

}

// class A implements Runnable {
//     public void run() { // run method is to run the thread
//         for (int i = 0; i < 5; i++) {

//             System.out.println("hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             } // this method will ask the thread to sleep for 10 miliseconds
//         }
//     }
// }

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {

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

public class threads2 {
    public static void main(String[] args) {

        Runnable a = (Runnable) new A(); // thread1
        Runnable b = new B(); // thread2

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        // System.out.println(a.getPriority()); //will give of the priority of the
        // thread
        // b.setPriority(Thread.MAX_PRIORITY); //suggest the schedular fo rthe priority
        t1.start();
        t2.start(); // start is in built method to create the thread

    }
}
