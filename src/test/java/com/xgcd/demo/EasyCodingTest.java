package com.xgcd.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EasyCodingTest {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        BigDecimal c = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal("0.2");
        BigDecimal e = c.divide(d);
        System.out.println(e);
        double f = 0.000123;
        BigDecimal bf = BigDecimal.valueOf(f);
        System.out.println(bf);
        // 集合处理
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String item : list) {
            if ("1".equals(item)) {
                list.remove(item);// 如果是2，ConcurrentModificationException
            }
        }

        String s = list.get(0);
        System.out.println(s);

        Object[] objects = list.toArray();
        Object object = objects[0];
        System.out.println(object);

        List<String> list2 = new ArrayList<>();
        list2.add("2");
        if (list.equals(list2)) {
            System.out.println("list equals list2");
            System.out.println(list.hashCode());
            System.out.println(list2.hashCode());
        } else {
            System.out.println("list not equals list2");
        }

        list.clear();

        int i = 2;
//        System.out.println(++i);// 3
        System.out.println(i++);// 2
        System.out.println(i);// 3
    }
}
