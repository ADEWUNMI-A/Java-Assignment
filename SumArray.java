package Chapter7;

//Create an array and initialize it with values. Sum all the values in the array and print them out.

public class SumArray {

    public static void main(String[] args) {

//        initialize an array with a set of numbers
//        initialize total to 0
//        loop through each numbers and calculate the values and store in total.
//        print the total.


        int[] numbers = {4, 20, 18, 16, 17};
        int total = 0;

        for (int count = 0; count < numbers.length; count++) {
            total += numbers[count];
        }
        System.out.printf("The total of array numbers is %d", total);
    }
}