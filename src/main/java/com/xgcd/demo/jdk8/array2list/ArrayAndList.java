package com.xgcd.demo.jdk8.array2list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.数组转集合  Arrays.asList(需要转为集合的数组);
 * 2.集合转数组  需要转为数组的集合.toArray(用于接收数据的新数组);
 */
public class ArrayAndList {
    public static void main(String[] args) {
        // 字符串数组
        String[] strings = new String[3];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "c";

        System.out.println(strings);// [Ljava.lang.String;@3f91beef

        /**
         * 1.数组转集合
         */
        List<String> stringList = Arrays.asList(strings);
        System.out.println(stringList);// [a, b, c]

        // 注意直接add,remove,clear会报错
//        stringList.add("d");// UnsupportedOperationException
//        System.out.println(stringList);

        // 如果要正常使用list的操作方法需要重新new一个ArrayList对象
        ArrayList list = new ArrayList(stringList);
        list.add("d");
        System.out.println(list);// [a, b, c, d]

        /**
         * 2.集合转数组
         */
        ArrayList<Object> integerList = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);// [1, 2, 3]

//        Integer[] objects = (Integer[])integerList.toArray();// integerList.toArray()这个是不能强转成Integer[]的,否则会报错:java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;

        // integerList.toArray(T[] a)这种方式,新生成的数组一定要大于原数组的大小,如果新数组长度不够,那么就会返回一个数组
        // 方式一,直接按list的size来创建数组
        Integer[] receiveArray = new Integer[integerList.size()];
        Integer[] reversedArray = integerList.toArray(receiveArray);
        System.out.println(reversedArray);// [Ljava.lang.Integer;@1a6c5a9e
        System.out.println(Arrays.asList(reversedArray));// [1, 2, 3]

        // 方式二,可以创建一个长度为1的数组,传递到toArray()方法中,但会返回一个新数组
        Integer[] receiveArray2 = new Integer[1];
        Integer[] reversedArray2 = integerList.toArray(receiveArray2);
        System.out.println(reversedArray2);// [Ljava.lang.Integer;@37bba400
        System.out.println(Arrays.asList(reversedArray2));// [1, 2, 3]

    }
}
