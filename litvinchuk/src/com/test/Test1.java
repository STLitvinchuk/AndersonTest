package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1{
    String keyWord = "menu";


    static private final int keyValue = 7;

    {
        System.out.println("Test 1 started");
    }


    public void testExecute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number for get result, input 'menu' for go to the menu");
            do {
                try {
                    String valAsString = reader.readLine();
                    if (valAsString.equals(keyWord)) {
                        System.out.println("Exit to menu");
                        return;
                    }
                    if (keyValue < Integer.valueOf(valAsString))
                        System.out.println("Привет");
                }
                catch(NumberFormatException e){
                    System.out.println("Must be number or 'menu'");
                }
                catch(Exception e){
                    System.out.println("Something wrong, try one more attempt");
                }
            } while (true);

    }
}
