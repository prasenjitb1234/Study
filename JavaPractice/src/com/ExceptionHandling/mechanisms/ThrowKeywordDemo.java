package com.ExceptionHandling.mechanisms;

public class ThrowKeywordDemo {
    public static void main(String[] args) {
        ThrowKeywordDemo t = new ThrowKeywordDemo();
        
        try {
            t.divide();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // The divide method
    void divide() {
        int a = 100;
        int b = 0;
        int c;

        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        c = a / b; // This will not execute if b == 0
        System.out.println(c);
    }
}
