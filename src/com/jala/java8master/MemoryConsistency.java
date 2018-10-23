package com.jala.java8master;

/**
 * Created by JC on 10/22/18.
 */
public class MemoryConsistency {
    private static boolean sayBot = false;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
           while(!sayBot) {

           }

           System.out.println("Hello World!");

           while(sayBot) {
               System.out.println("Bye Bye World!");

           }

           System.out.println("Good Bye!");
        });

        thread.start();

        Thread.sleep(1000);
        System.out.println("Say Hello..");
        sayBot = true;

        Thread.sleep(1000);
        System.out.println("Say Bye..");
        sayBot = false;
    }
}