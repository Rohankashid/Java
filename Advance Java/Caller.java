import java.util.concurrent.*;


public class Caller implements Executor {

    @Override
    public void execute(Runnable runnable) {
       
        runnable.run();
    }

}
