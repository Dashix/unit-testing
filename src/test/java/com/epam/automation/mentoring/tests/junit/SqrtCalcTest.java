package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SqrtCalcTest extends BaseTestForJUnit {

    @Test
    public void testSqrt() {
        double a = 8.0;
        double expectedResult = Math.sqrt(a);

        double result = calculator.sqrt(a);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

}
