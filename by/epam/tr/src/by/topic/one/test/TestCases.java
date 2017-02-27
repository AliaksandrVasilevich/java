package by.topic.one.test;

import by.topic.one.mathematics.NumberSumma;
import by.topic.one.util.Validation;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Aliaksandr_Vasilevic on 2/21/2017.
 */
public class TestCases {
    @Test(timeout = 500)
    public void summaTimeTest (){
        int expected = 10;
        int actual = NumberSumma.summa(1234);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void summaTest (){
        int expected = 10;
        int actual = NumberSumma.summa(1234);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void validatorTestPass () {
        String p = "01234";
        boolean actual = Validation.validInt(p);
        Assert.assertTrue(actual);
    }
    @Test
    public void validatorTestFail () {
        String p = "O1234";
        boolean actual = Validation.validInt(p);
        Assert.assertFalse(actual);
    }

}
