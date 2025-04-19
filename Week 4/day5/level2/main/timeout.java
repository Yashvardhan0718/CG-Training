package week4.day5.level2.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.SECONDS;

public class timeout {
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Test
    @Timeout(value = 2, unit = SECONDS)
    void testTimeout() throws InterruptedException {
        longRunningTask();
    }
}
