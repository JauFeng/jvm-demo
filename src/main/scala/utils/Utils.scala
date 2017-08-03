package utils

import java.time.LocalTime

object Utils {

  val size = 1024

  def printCurrentMemory(): Unit = {
    val totalMemory = Runtime.getRuntime.totalMemory() / size
    val maxMemory = Runtime.getRuntime.maxMemory() / size
    val freeMemory = Runtime.getRuntime.freeMemory() / size

    println(
      s"Time: ${LocalTime.now()}, totalMemory: $totalMemory k, maxMemory: $maxMemory k, freeMemory: $freeMemory k")
  }
}
