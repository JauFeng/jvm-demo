package oom;

import utils.Utils;

/**
 * VM options:
 *
 * <blockquote>
 *
 * <pre>
 *  -XX:MaxMetaspaceSize=2m
 *  -XX:+PrintGC
 *  -XX:+PrintGCDetails
 *  -XX:+PrintGCTimeStamps
 *  -Xloggc:logs/gc.log
 * </pre>
 *
 * </blockquote>
 */
public class Metaspace {
  public static void main(String[] args) throws Exception {
    Utils.printCurrentMemory();
  }
}
