package com.java.lambda.functional;


import java.util.function.Supplier;

class SupplierImpl implements Supplier<String>{
    @Override
    public String get() {
        System.out.println("Inside SupplierDemo");
        return null;
    }
}
public class SupplierDemo {

    public static void main(String[] args){

//        Supplier<String> demo= new SupplierImpl();
//        demo.get();

// If single body function -> return is not expected in lambda, however, if {} and uses multi line
// expression, then the function expects the return statement

        Supplier<String> demo1 = () ->"Inside the supplier Lambda";

        System.out.println(demo1.get());


    }



}
