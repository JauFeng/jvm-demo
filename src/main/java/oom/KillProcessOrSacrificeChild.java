package oom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * VM options:
 *
 * <blockquote>
 *
 * <pre>
 *     -Xmx100m
 *     -XX:+PrintGC
 *     -XX:+PrintGCDetails
 *     -XX:+PrintGCTimeStamps
 *     -Xloggc:logs/gc.log
 * </pre>
 *
 * </blockquote>
 */
public class KillProcessOrSacrificeChild {
  public static void main(String[] args) {
    final AtomicReference<List<int[]>> list =
        new AtomicReference<>(new ArrayList<>(100_000 - 10_000));
    for (int i = 10_000; i < 100_000; i++) {
      try {
        list.get().add(new int[10_000]);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }
}
