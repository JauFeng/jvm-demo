package oom;

import utils.Utils;

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
 *     -XX:+HeapDumpOnOutOfMemoryError
 * </pre>
 *
 * </blockquote>
 */
public class JavaHeapSpace {
  private static final int SIZE = 2 * 1024 * 1024;

  public static void main(String[] a) {

    Utils.printCurrentMemory();

    final int[] ints = new int[SIZE];

    Utils.printCurrentMemory();
  }
}
