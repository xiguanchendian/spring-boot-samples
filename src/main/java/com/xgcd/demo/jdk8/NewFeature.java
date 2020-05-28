//package com.xgcd.demo.jdk8;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class NewFeature {
//    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        List<Object> collect = list.stream()
//                .map(x -> x * 2)
//                .filter(num -> num > 20)
//                .collect(Collectors.toList());
//        System.out.println(collect);
//    }
//}
