package com.java.lambda.functional;

import java.util.function.Function;
class Functionalimpl implements Function<String, Integer>{

   @Override
    public Integer apply(String s) {
        return s.length(); // declare method signature
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
       Function<String, Integer> demo = (String s) -> s.length(); // provides actual impl to method sign
       Integer demoimpl=demo.apply("Mayur");
       System.out.println(demoimpl);
    }
}
