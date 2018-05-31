package edu.fjut.ywj.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * User: By Mio
 * Name: edu.fjut.ywj.util.DateConverter
 * Date: Created in 2018/5/15 8:12
 */

public class MyDateConverter  {

    private MyDateConverter(){

    }
    public static Date convertDate(String source) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

        return sdf.parse(source);

    }

    public static String newDate() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
