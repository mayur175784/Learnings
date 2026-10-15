package com.java.lambda;


class threaddemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside the threaddemo, run method called");
    }
}
public class RunnableLambdaExample {

    public static void main(String[] args) {
        Thread thread= new Thread(new threaddemo());
        thread.start();
    // below here is using Lambda

        Runnable runnable = ()-> {
            System.out.println("Inside run method, using lambda");
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();


    }

}
