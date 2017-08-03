package oom;

import java.util.stream.Stream;
import utils.Utils;

/**
 * VM options:
 *
 * <blockquote>
 *
 * <pre>
 *     -Xmx10m
 *     -XX:+PrintGC
 *     -XX:+PrintGCDetails
 *     -XX:+PrintGCTimeStamps
 *     -Xloggc:logs/gc.log
 * </pre>
 *
 * </blockquote>
 */
public class RequestedArraySizeExceedsVMLimit {

  public static void main(String[] args) {

    // 2^31-3 = 2,147,483,645 (Java heap space - require 8G of memory which is less than the defaults used by the JVM.)
    // 2^31-2 = 2,147,483,646 (Java heap space - require 8G of memory which is less than the defaults used by the JVM.)
    // 2^31-1 = 2,147,483,647 (Requested array size exceeds VM limit)
    // 2^31-0 = 2,147,483,648 (Requested array size exceeds VM limit)

    Utils.printCurrentMemory();

    Stream.of(3, 2, 1, 0)
        .forEach(
            index -> {
              final int size = Integer.MAX_VALUE - index;
              try {
                int[] arr = new int[size];
                System.out.format("Successfully initialized an array with %,d elements.\n", size);
              } catch (Throwable t) {
                t.printStackTrace();
              }
            });
  }
}
