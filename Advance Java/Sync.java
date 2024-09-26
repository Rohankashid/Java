public class Sync {
    public static void main(String[] args) {
        MathUtils obj =new MathUtils();

        Thread1 t1 =new Thread1(obj);
        Thread t2 =new Thread(new Thread2(obj));
        t1.start();
        t2.start();
    }
}

class MathUtils{
     void getMathUtils(int n){
        
       synchronized (this){              // makes the block syncronized avoids random o/p
        for (int i = 1; i < 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    }
}

class Thread1 extends Thread{
    MathUtils mu;
    public Thread1(MathUtils mu){
        this.mu=mu;
    }

    public void run(){
        try {
            mu.getMathUtils(2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Thread2 implements Runnable{
    MathUtils mu;
    public Thread2(MathUtils mu){
        this.mu=mu;
    }

    public void run(){
        try {
            mu.getMathUtils(5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}