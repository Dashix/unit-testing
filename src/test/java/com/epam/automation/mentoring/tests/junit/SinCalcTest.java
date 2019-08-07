package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SinCalcTest extends BaseTestForJUnit {

    @Test
    public void testSin() {
        double a = 8.0;
        double expectedResult = Math.sin(a);

        double result = calculator.sin(a);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

}
