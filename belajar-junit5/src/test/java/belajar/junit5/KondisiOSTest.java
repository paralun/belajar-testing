package belajar.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class KondisiOSTest {

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    public void onlyRunOnWindows() {

    }

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void disabledRunOnWindows() {

    }
}
