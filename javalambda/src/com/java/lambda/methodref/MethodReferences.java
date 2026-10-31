package com.java.lambda.methodref;

import com.java.lambda.functional.FunctionDemo;
import com.sun.jdi.IntegerType;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferences {

    public static void print(Character s){
        System.out.println(s);
    }
    public static int add(int a , int b){
        return a+b;
    }
    public static void main(String[] args){
//         1. Method reference to a static method.

//         We will first write a lambda function and then convert it to a method reference.

//        Function<Integer, Double> func = (input)->Math.sqrt(input);
//        System.out.println(func.apply(4));

//         Function<Integer, Double> func1 = Math::sqrt;
//        System.out.println(func1.apply(4));


        List<Character> students = Arrays.asList('A','B','C');
//        students.forEach(x-> {
//            System.out.println(x);
//        });

        students.forEach(MethodReferences::print);


//        2. Example of declared static method - Lambda used below
//        BiFunction<Integer,Integer, Integer> bifunc = (a,b)->MethodReferences.add(a,b);
//        System.out.println(bifunc.apply(10,20));

//        using the methodreference for static method
        BiFunction<Integer, Integer, Integer>bifunc= MethodReferences::add;
        System.out.println(bifunc.apply(10,20));

//        3.Method reference to instance method of particular object.


    }
}
