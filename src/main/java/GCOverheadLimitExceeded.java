import static java.lang.System.getProperties;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.stream.Stream;

public class GCOverheadLimitExceeded {

  public static void main(String args[]) {
    final Properties properties = getProperties();
    final SecureRandom secureRandom = new SecureRandom();

    Stream.iterate(BigInteger.ZERO, integer -> integer.add(BigInteger.ONE))
        .forEach(bigInteger -> func(properties, secureRandom));
  }

  private static void func(final Properties properties, final SecureRandom secureRandom) {
    properties.setProperty(String.valueOf(secureRandom.nextInt()), "value");
    MyScala.printCurrentMemory();
  }
}
