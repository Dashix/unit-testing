package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class CosCalcTest extends BaseTestForJUnit {

    @Test
    public void testCos() {
        double a = 8.0;
        double expectedResult = Math.cos(a);

        double result = calculator.cos(a);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

}
