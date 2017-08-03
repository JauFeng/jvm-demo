package oom;

import java.util.ArrayList;
import java.util.List;

public class KillProcessOrSacrificeChild {
  public static void main(String[] args) {
    final List<int[]> list = new ArrayList<>();
    for (int i = 10_000; i < 100_000; i++) {
      try {
        list.add(new int[100_000]);
      } catch (Throwable t) {
        t.printStackTrace();
      }
    }
  }
}