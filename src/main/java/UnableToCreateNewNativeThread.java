public class UnableToCreateNewNativeThread {
    public static void main(String[] args) {
        while (true) {
            new Thread(() -> {
                try {
                    Thread.sleep(10_000_000);
                } catch (InterruptedException e) {
                }
            }).start();
        }
    }
}