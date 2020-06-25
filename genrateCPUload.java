public class genrateCPUload {
    private static void spin(int milliseconds) {
        long sleepTime = milliseconds * 1000000L; // convert to nanoseconds
        long startTime = System.nanoTime();
        while ((System.nanoTime() - startTime) < sleepTime) {
        }
    }

    public static void main(String[] args) {
        final int NUM_TESTS = 1000;
        long start = System.nanoTime();
        for (int i = 0; i < NUM_TESTS; i++) {
            spin(500);
        }
        System.out.println("Took " + (System.nanoTime() - start) / 1000000 + "ms (expected " + (NUM_TESTS * 500) + ")");
    }

}

/** a program in java to generate CPU load (CPU usage upto 100%). */