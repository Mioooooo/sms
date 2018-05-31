package edu.fjut.ywj.Test;

import edu.fjut.ywj.util.MyDateConverter;
import org.junit.Test;

import java.text.ParseException;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.Test.DateTest
 * Date: Created in 2018/5/15 8:15
 */

public class DateTest{
    @Test
    public void TestA() throws ParseException {
        System.out.println(MyDateConverter.newDate().toString());
    }
}
