import java.util.*;

class Calculator{
    public static int add(int a, int b){
        return a+b;
    }
}

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("Adding two numbers");
        int res = Calculator.add(100, 200);
        System.out.println("Sum of two numbers = "+res);
    }
}