import java.util.*;

class Calculator{
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
}

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        
        System.out.println("Adding two numbers");
        int res1 = Calculator.add(100, 200);
        System.out.println("Sum of two numbers = "+res1);

        System.out.println("Subtracting two numbers");
        int res2 = Calculator.sub(100,500);
        System.out.println("Subtraction of two numbers = "+res2);
    }
}