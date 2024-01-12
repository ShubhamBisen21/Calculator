package com.jsp.pack1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator.");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                switch (choice) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                        break;
                    case 4:
                        double result = divide(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }
//Separate methods for add/sub/multiply/divide
    static double add(double x, double y) 
    {
        return x + y;
    }

    static double subtract(double x, double y) 
    {
        return x - y;
    }

    static double multiply(double x, double y) 
    {
        return x * y;
    }

    static double divide(double x, double y) 
    {
        if (y != 0) {
            return x / y;
        } else {
            return Double.NaN;
        }
    }
}
