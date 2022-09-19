package Chapter2;

/*Write an application that asks the user to enter two integers, obtains them from
the user and prints the square of each, the sum of their squares, and the difference of the squares (first
number squared minus the second number squared).*/

public class Arithmetic {

        public int squareOfNumber(int number1) {
            return (number1 * number1);
        }

        public int sumOfSquareOfTwoNumber(int number1, int number2){
            int result1 = number1 * number1;
            int result2 = number2 * number2;
            return result1 + result2;
        }

    public int differenceOfSquareOfTwoNumber(int number1, int number2) {
        int result1 = number1 * number1;
        int result2 = number2 * number2;
        return result1 - result2;
    }
}
