package com;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        String s = "2018/01/05 08:00:00";
        Date other = sdf.parse(s);
        System.out.println(other);
         
        Period p = Period.between(dateToLocalDate(date), dateToLocalDate(other));
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        
    }
    
    public static LocalDate dateToLocalDate(Date date) {
        // Date 轉 LocalDateTime
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime now = instant.atZone(zoneId).toLocalDateTime();
//        System.out.println("Date = " + date);
//        System.out.println("LocalDateTime = " + now);
        return now.toLocalDate();
    }
}
