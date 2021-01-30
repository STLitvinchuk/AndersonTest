package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test3{
    String keyWord = "menu";
    {
        System.out.println("Test 3 started");
    }


    public void testExecute() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input data (as view num1 num2 num3 ... numN ) for get result , input 'menu' for go to the menu");
        do {
            try {
                String valAsString = reader.readLine();
                if (valAsString.equals(keyWord)) {
                    System.out.println("Exit to menu");
                    return;
                }
                String[] strArr = valAsString.split(" ");
                 ArrayList<Integer> intData = new ArrayList<Integer>();
                for (String str:strArr){
                    try{
                        intData.add(Integer.valueOf(str));
                    }catch(NumberFormatException e){
                        System.out.println("Check data in \"" + str + "\", please");
                    }
                }

                int counter = 2;
                if (intData.size() > 2){
                    System.out.println("Output:");
                    while(counter <= intData.size()){
                        System.out.print(intData.get(counter));
                        if ((counter + 3) < intData.size())
                            System.out.print(", ");
                        else
                            System.out.println(".");
                        counter += 3;
                    }
                }


            }
            catch(IOException e){
                System.out.println("Something wrong, try one more attempt");
            }
        } while (true);
    }
}

