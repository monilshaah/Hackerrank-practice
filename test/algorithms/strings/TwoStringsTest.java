package algorithms.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Monil on 4/5/16.
 */
public class TwoStringsTest {
    String str1, str2, result;

    @Before
    public void setUp() throws Exception {
        System.out.println("In before class");
        str1 = "hello";
        str2 = "world";
        result = "YES";
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("In after class");
        str1 = "hi";
    }

    @Test
    public void checkForSubstrings() throws Exception {
        Assert.assertEquals("t01!", result, TwoStrings.checkForSubstrings(str1, str2));
        Assert.assertEquals("t02!", "NO", TwoStrings.checkForSubstrings("hi", str2));
    }

//    @Test
//    public void checkForSubstrings2() throws Exception {
//        Assert.assertEquals("Success!", result, TwoStrings.checkForSubstrings(str1, str2));
//    }
}