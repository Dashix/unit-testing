package com.epam.automation.mentoring.tests.testng.parallel;

import com.epam.automation.mentoring.tests.BaseTestForTestNg;
import com.epam.tat.module4.Timeout;
import org.testng.annotations.Test;

import java.util.Date;

public class ParallelExecutionTest extends BaseTestForTestNg {

    @Test
    public void testParallel1() {
        checkTime();
        Timeout.sleep(2);
    }

    @Test
    public void testParallel2() {
        checkTime();
        Timeout.sleep(2);
    }

    @Test
    public void testParallel3() {
        checkTime();
        Timeout.sleep(2);
    }

    private void checkTime() {
        System.out.println("Current time is : " + new Date(System.currentTimeMillis()));
    }

}
