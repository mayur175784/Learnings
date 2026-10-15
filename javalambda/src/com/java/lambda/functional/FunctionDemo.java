package com.java.lambda.functional;

import java.util.function.Function;

}

public class FunctionDemo {
    public static void main(String[] args) {
        demo obj = ()->{
            System.out.println("Inside the lambda");
        };
        obj.func();
    }
}
