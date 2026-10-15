package com.java.lambda;



interface  Addable{
    int addition(int a , int b);
}

class AddableImpl implements Addable{
    @Override
    public int addition(int a, int b) {
        return (a+b);
    }

    }
public class LambdaParameters {
 Addable addition = (a,b) ->{
     return a+b;
 };
}
