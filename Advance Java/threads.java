public class threads {
    public static void main(String[] args) {
        int n=10 ;
        for(int i=0 ; i<n ; i++){
            Thread1 t1 = new Thread1();
            t1.start();

            Thread t2 = new Thread(new Thread2());
            t2.start();
        }
    }
}

class Thread1 extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("thread 1 is running ");
        }
        catch(Exception e){
            System.out.println("exception raised:"+e);
        }
    }
}

class Thread2 implements Runnable{
        @Override
        public void run(){
            try {
                System.out.println("thread 2 is running ");
            } catch (Exception e) {
                System.out.println("exception raised:"+e);
            }

        }
}
