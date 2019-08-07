package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class SubDoubleCalcTest extends BaseTestForJUnit {

    @Test
    public void testSubtractionWithDoubleParameters() {
        double a = 5.0;
        double b = 3.5;
        double expectedResult = 1.5;

        double result = calculator.sub(a, b);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }
}
