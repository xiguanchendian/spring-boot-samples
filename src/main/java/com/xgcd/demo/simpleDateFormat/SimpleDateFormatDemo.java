package com.xgcd.demo.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String sdate = sdf.format(date);
        System.out.println(sdate);

        try {
            Date ddate = sdf.parse(sdate);
            System.out.println(ddate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
