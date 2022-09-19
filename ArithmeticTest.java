package Chapter2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        int square1 = arithmetic.squareOfNumber(number1);
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        int square2 = arithmetic.squareOfNumber(number2);
        int sum = arithmetic.sumOfSquareOfTwoNumber(number1, number2);
        int difference = arithmetic.differenceOfSquareOfTwoNumber(number1, number2);

        System.out.printf("The square of the first number is: %d ", square1);
        System.out.printf("%nThe square of the second number is: %d: ", square2);
        System.out.printf("%nThe sum of the first and second number is: %d", sum);
        System.out.printf("%nThe difference between the first and second number is: %d", difference);
    }
}
