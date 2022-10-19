package com.example.calc;

import java.io.IOException;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) throws IOException {
        System.out.println("--------------- CALCULATOR ----------------------------------------------");
        Scanner values_from_keyboard = new Scanner(System.in);
        Calculadora calculadora;
        calculadora = new Calculadora();

        System.out.println("Enter the first value: ");
        Integer value1 = values_from_keyboard.nextInt();
        System.out.println(("Enter second value: "));
        Integer value2 = values_from_keyboard.nextInt();
        System.out.println("Enter Operation: ");
        String operation = values_from_keyboard.next();


        switch(operation) {
            case "sum":
                System.out.println("The sum result: " + calculadora.sum(value1, value2));
                break;
            case "subtract"   :
                System.out.println("The sum result: " + calculadora.subtract(value1, value2));
                break;
            case "multiply"   :
                System.out.println("The sum result: " + calculadora.multiply(value1, value2));
                break;
            case "divide"   :
                System.out.println("The sum result: " + calculadora.divide(value1, value2));
                break;
            default:
                System.out.println("It was not a valid operation. Follow the valid operations: sum, subtract, multiply and divide");

        }
        System.out.println("--------------- End of operation, thanks for using ----------------------------------------------");

    }
}
