package com.java.lambda.functional;
import java.util.function.Consumer;
/*
class consumerimpl implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println("Inside the accept method implemented by "+s);
    }
}  Both class and lambda are two ways to do same thing. If high complexity,reusability use class. Otherwise use lambda
Also, this code will run without consumerimpl
*/
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> demo = (String s) -> {
            System.out.println("Inside the lambda");
        };
        demo.accept("Mayur");
    }
}
