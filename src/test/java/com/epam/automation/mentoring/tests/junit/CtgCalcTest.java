package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class CtgCalcTest extends BaseTestForJUnit {

    @Test
    public void testCtg() {
        double a = 8.0;
        double expectedResult = 1.0 / Math.tan(a);

        double result = calculator.ctg(a);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }
}
