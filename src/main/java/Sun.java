import java.util.concurrent.*;

/**
 * Created by shine.sun
 * 2018-09-21 14:34
 */
public class Sun {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 2 + 1, Runtime.getRuntime().availableProcessors() * 2 + 1 > 20 ? Runtime.getRuntime().availableProcessors() * 2 + 1 : 20, 10 * 60 * 1000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1000), new ThreadPoolExecutor.AbortPolicy());

    }
}
