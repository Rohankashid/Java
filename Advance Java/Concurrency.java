import java.util.concurrent.*;


public class Concurrency {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorInvoke(){
        Executor executor = new Caller();
        executor.execute(()->{
            System.out.println("executor Example ");
        });
    }

    private static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println("executor service example");
        });
    }
}
