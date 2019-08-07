package com.epam.automation.mentoring.tests.junit;

import com.epam.automation.mentoring.tests.BaseTestForJUnit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TgCalcTest extends BaseTestForJUnit {

    @Test
    public void testTg() {
        double a = 8.0;
        double expectedResult = Math.tan(a);

        double result = calculator.tg(a);
        Assert.assertThat(result, CoreMatchers.is(expectedResult));
    }

}
