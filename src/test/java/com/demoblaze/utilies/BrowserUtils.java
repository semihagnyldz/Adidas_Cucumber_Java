package com.demoblaze.utilies;

public class BrowserUtils {

    public static void sleep(int second){
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
