package com.xgcd.demo.jdk8.array2list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        String[] tmpArr = new String[list.size()];
        String[] arr = (String[]) list.toArray(tmpArr);
        System.out.println(Arrays.asList(arr));
    }
}
