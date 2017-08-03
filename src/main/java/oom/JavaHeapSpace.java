package oom;

import utils.Utils;

public class JavaHeapSpace {
    private static final int SIZE = 2 * 1024 * 1024;

    public static void main(String[] a) {

        Utils.printCurrentMemory();

        final int[] ints = new int[SIZE];

        Utils.printCurrentMemory();
    }
}