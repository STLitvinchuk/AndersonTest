package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        System.out.println("task from Anderson");
        String strHello = "Input number for check test (1 - test #1, 2 - test #2, 3 - test #3 ), input 'exit' for exit";
        System.out.println(strHello);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStrValue = new String();

       do{
            try {
                 inputStrValue = reader.readLine();
            }catch(Exception e){
                 System.out.println("Something wrong, try one more attempt");
            }
            switch (inputStrValue){
                case "1": new Test1().testExecute();
                            System.out.println(strHello);
                          break;
                case "2": new Test2().testExecute();
                            System.out.println(strHello);
                          break;
                case "3": new Test3().testExecute();
                            System.out.println(strHello);
                          break;
                case "exit":
                          System.out.println("By :)");
                          try {
                              TimeUnit.SECONDS.sleep(1);
                          }
                          catch (InterruptedException e){
                              System.out.println(e);
                          }
                          return;
            }
          }while (true);
    }
}
