package oom;

/**
 * VM options:
 *
 * <blockquote>
 *
 * <pre>
 *     -Xmx5m
 *     -XX:+PrintGC
 *     -XX:+PrintGCDetails
 *     -XX:+PrintGCTimeStamps
 *     -Xloggc:logs/gc.log
 * </pre>
 *
 * </blockquote>
 */
public class UnableToCreateNewNativeThread {
  public static void main(String[] args) {
    while (true) {
      new Thread(
              () -> {
                try {
                  Thread.sleep(10_000_000);
                } catch (InterruptedException e) {
                }
              })
          .start();
    }
  }
}
