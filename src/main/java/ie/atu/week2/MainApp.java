package ie.atu.week2;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please your first number:");
        int firstNumber = scan.nextInt();
        System.out.println("Please your second number:");
        int secondNumber = scan.nextInt();

        Calculator calc = new Calculator();
        int result = calc.power(firstNumber, secondNumber);
        System.out.println("The result is: " + result);

        int result1 = calc.add(firstNumber, secondNumber);
        System.out.println("The result is: " + result1);

        int result2 = calc.subtract(firstNumber, secondNumber);
        System.out.println("The result is: " + result2);

        int result3 = calc.multiply(firstNumber, secondNumber);
        System.out.println("The result is: " + result3);

        int result4 = calc.divide(firstNumber, secondNumber);
        System.out.println("The result is: " + result4);
    }
}
