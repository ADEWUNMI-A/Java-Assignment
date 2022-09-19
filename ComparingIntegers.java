package Chapter2;
/*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100.*/
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Arithmetic comparingIntegers = new Arithmetic();
        int value = 100;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a number");
        int number = input.nextInt();
        int squaredNumber = comparingIntegers.squareOfNumber(number);

        if (number == value) {
            System.out.printf(" %d = %d", number, value);
        }
        else if (squaredNumber > value) {
            System.out.printf("The square of %d is > %d", number, value);
        }
    }
}
