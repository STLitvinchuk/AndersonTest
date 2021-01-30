package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2{
    String keyWord = "menu";
    {
        System.out.println("Test 2 started");
    }


    public void testExecute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String keyValue="Вячеслав";
        System.out.println("Input secret name for get result, input 'menu' for go to the menu");
        do {
            try {
                String valAsString = reader.readLine();
                if (valAsString.equals(keyWord)) {
                    System.out.println("Exit to menu");
                    return;
                }
                if (keyValue.equals(valAsString))
                    System.out.println("Привет, Вячеслав");
            }
            catch(Exception e){
                System.out.println("Something wrong, try one more attempt");
            }
        } while (true);

    }
}
