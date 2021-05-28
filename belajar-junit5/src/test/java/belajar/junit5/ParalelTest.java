package belajar.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

@Execution(ExecutionMode.CONCURRENT)
public class ParalelTest {

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void Test1() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void Test2() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void Test3() throws InterruptedException {
        Thread.sleep(4000);
    }
}
