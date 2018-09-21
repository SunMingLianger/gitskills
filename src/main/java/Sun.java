/**
 * Created by shine.sun
 * 2018-09-21 14:34
 */
public class Sun {

   /* public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 2 + 1, Runtime.getRuntime().availableProcessors() * 2 + 1 > 20 ? Runtime.getRuntime().availableProcessors() * 2 + 1 : 20, 10 * 60 * 1000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(1000), new ThreadPoolExecutor.AbortPolicy());

    }*/

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Runtime.getRuntime().availableProcessors());
        }
    }
    /**
     * To github.com:SunMingLianger/gitskills.git
     *  ! [rejected]        master -> master (non-fast-forward)
     * error: failed to push some refs to 'git@github.com:SunMingLianger/gitskills.git'
     * hint: Updates were rejected because the tip of your current branch is behind its remote counterpart
     * hint: . Integrate the remote changes (e.g.
     * hint: 'git pull ...') before pushing again.
     * hint: See the 'Note about fast-forwards' in 'git push --help' for details.
     */
}
