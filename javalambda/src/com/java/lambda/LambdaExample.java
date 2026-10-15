package com.java.lambda;

import java.sql.SQLOutput;

interface shape{
    void draw();
}

/*
class Rectangle implements shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class draw method");

    }
}

class Square implements shape{

    @Override
    public void draw() {
        System.out.println("Square class draw method");
    }
}


class circle implements shape{

    @Override
    public void draw() {
        System.out.println("circle class draw method");
    }
}

*/
    public class LambdaExample {

         public static void main(String args[]){
             String str="Hello";
             shape rect= ()->{
                 System.out.println("Rectangle  class : Draw method()");
             };
             rect.draw();
         shape circle= ()->{
             System.out.println("Circle class : Draw method()");
         };
         circle.draw();
     }
}
