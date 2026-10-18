package com.java.lambda.functional;

import java.util.function.Function;
class Functionalimpl implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
       Functionalimpl demo = new Functionalimpl();
        int len= demo.apply("Mayur");
        System.out.println("Length: "+ len);
    }
}
